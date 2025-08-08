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

            // Products table
            stmt.execute("CREATE TABLE IF NOT EXISTS products ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "barcode TEXT UNIQUE NOT NULL,"
                    + "si_name TEXT NOT NULL,"
                    + "en_name TEXT NOT NULL,"
                    + "weladapala_mila REAL NOT NULL,"
                    + "ape_mila REAL NOT NULL)");

            stmt.execute("INSERT OR IGNORE INTO products (barcode, si_name, en_name, weladapala_mila, ape_mila) VALUES "
                    + "('1001', 'සීනි', 'Sugar', 150.0, 180.0),"
                    + "('1002', 'ටේ', 'Tea', 200.0, 250.0),"
                    + "('1003', 'කෝපි', 'Coffee', 300.0, 350.0)");

            // Creditors table with check
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
            } else if (!hasLastCreditDate) {
                stmt.execute("ALTER TABLE creditors ADD COLUMN last_credit_date TEXT");
                stmt.execute("UPDATE creditors SET last_credit_date = datetime('now', 'localtime') WHERE last_credit_date IS NULL");
            }

            // Add test creditors
            stmt.execute("INSERT OR IGNORE INTO creditors (id, name, total_debt, last_credit_date) VALUES "
                    + "(1, 'Kasun', 1000.0, datetime('now', '-2 days')),"
                    + "(2, 'Nimali', 500.0, datetime('now', '-1 days'))");

            // Bills table
            stmt.execute("CREATE TABLE IF NOT EXISTS bills ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "datetime TEXT NOT NULL,"
                    + "total_amount REAL NOT NULL,"
                    + "paid_amount REAL NOT NULL,"
                    + "creditor_id INTEGER,"
                    + "FOREIGN KEY(creditor_id) REFERENCES creditors(id))");

            // Add test bills (cash and credit)
            stmt.execute("INSERT OR IGNORE INTO bills (id, datetime, total_amount, paid_amount, creditor_id) VALUES "
                    + "(1, datetime('now', '-2 days'), 700.0, 700.0, NULL),"
                    + // Cash
                    "(2, datetime('now', '-1 days'), 1000.0, 0.0, 1),"
                    + // Credit - Kasun
                    "(3, datetime('now'), 1500.0, 1500.0, NULL),"
                    + // Cash
                    "(4, datetime('now'), 500.0, 0.0, 2)");                   // Credit - Nimali

            // Bill Items table
            stmt.execute("CREATE TABLE IF NOT EXISTS bill_items ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "bill_id INTEGER NOT NULL,"
                    + "barcode TEXT NOT NULL,"
                    + "product_name TEXT NOT NULL,"
                    + "marked_price REAL NOT NULL,"
                    + "sold_price REAL NOT NULL,"
                    + "quantity INTEGER NOT NULL,"
                    + "FOREIGN KEY(bill_id) REFERENCES bills(id) ON DELETE CASCADE)");

            // Add test bill items
            stmt.execute("INSERT OR IGNORE INTO bill_items (bill_id, barcode, product_name, marked_price, sold_price, quantity) VALUES "
                    + "(1, '1001', 'Sugar', 150.0, 180.0, 2),"
                    + "(2, '1002', 'Tea', 200.0, 250.0, 3),"
                    + "(3, '1001', 'Sugar', 150.0, 180.0, 1),"
                    + "(3, '1003', 'Coffee', 300.0, 350.0, 1),"
                    + "(4, '1003', 'Coffee', 300.0, 350.0, 2)");

            System.out.println("Tables and test data initialized successfully");
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
