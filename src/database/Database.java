package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    private static Database instance;
    private static Connection conn;
    private static final String URL = "jdbc:sqlite:pos.db";

    private Database() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(URL);
            System.out.println("SQLite Initialized");
            addTables();
        } catch (SQLException e) {
            System.out.println(e + " SQLite Exception");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Database getInstace() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    private void addTables() {
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("PRAGMA foreign_keys = ON");

            stmt.execute("CREATE TABLE IF NOT EXISTS products ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "barcode TEXT UNIQUE NOT NULL,"
                    + "si_name TEXT NOT NULL,"
                    + "en_name TEXT NOT NULL,"
                    + "weladapala_mila REAL NOT NULL,"
                    + "ape_mila REAL NOT NULL)");

            boolean creditorsTableExists = checkTableExists(stmt, "creditors");
            boolean hasLastCreditDate = false;

            if (creditorsTableExists) {
                hasLastCreditDate = checkColumnExists(stmt, "creditors", "last_credit_date");
            }

            if (!creditorsTableExists) {
                stmt.execute("CREATE TABLE creditors ("
                        + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                        + "name TEXT NOT NULL,"
                        + "total_debt REAL NOT NULL DEFAULT 0,"
                        + "last_credit_date TEXT)");
                System.out.println("Created creditors table with last_credit_date column");
            } else if (!hasLastCreditDate) {

                stmt.execute("ALTER TABLE creditors ADD COLUMN last_credit_date TEXT");
                // Update existing records with current date
                stmt.execute("UPDATE creditors SET last_credit_date = datetime('now', 'localtime') WHERE last_credit_date IS NULL");
                System.out.println("Added last_credit_date column to existing creditors table");
            }

            stmt.execute("CREATE TABLE IF NOT EXISTS bills ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "datetime TEXT NOT NULL,"
                    + "total_amount REAL NOT NULL,"
                    + "paid_amount REAL NOT NULL,"
                    + "creditor_id INTEGER,"
                    + // null for cash customer
                    "FOREIGN KEY(creditor_id) REFERENCES creditors(id))");


            stmt.execute("CREATE TABLE IF NOT EXISTS bill_items ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "bill_id INTEGER NOT NULL,"
                    + "barcode TEXT NOT NULL,"
                    + "product_name TEXT NOT NULL,"
                    + "marked_price REAL NOT NULL,"
                    + "sold_price REAL NOT NULL,"
                    + "quantity INTEGER NOT NULL,"
                    + "FOREIGN KEY(bill_id) REFERENCES bills(id) ON DELETE CASCADE");

            System.out.println("Tables initialized successfully");
        } catch (SQLException e) {
            System.err.println("Table Init Error: " + e.getMessage());
        }
    }

    private boolean checkTableExists(Statement stmt, String tableName) {
        try {
            var rs = stmt.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='" + tableName + "'");
            return rs.next();
        } catch (SQLException e) {
            return false;
        }
    }

    private boolean checkColumnExists(Statement stmt, String tableName, String columnName) {
        try {
            var rs = stmt.executeQuery("PRAGMA table_info(" + tableName + ")");
            while (rs.next()) {
                if (columnName.equals(rs.getString("name"))) {
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            return false;
        }
    }
}
