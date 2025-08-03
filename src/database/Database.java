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

    public Connection getConnection() {
        return conn;
    }

    private void addTables() {
        try (Statement stmt = conn.createStatement()) {

            // Enable foreign key constraint
            stmt.execute("PRAGMA foreign_keys = ON");

            // Products table
            stmt.execute("CREATE TABLE IF NOT EXISTS products (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "barcode TEXT UNIQUE NOT NULL," +
                    "si_name TEXT NOT NULL," +
                    "en_name TEXT NOT NULL," +
                    "weladapala_mila REAL NOT NULL," +
                    "ape_mila REAL NOT NULL)");

            // Creditors table
            stmt.execute("CREATE TABLE IF NOT EXISTS creditors (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT NOT NULL," +
                    "total_debt REAL NOT NULL DEFAULT 0)");

            // Bills table
            stmt.execute("CREATE TABLE IF NOT EXISTS bills (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "datetime TEXT NOT NULL," +
                    "total_amount REAL NOT NULL," +
                    "paid_amount REAL NOT NULL," +
                    "creditor_id INTEGER," + // null for cash customer
                    "FOREIGN KEY(creditor_id) REFERENCES creditors(id))");

            // Bill items table
            stmt.execute("CREATE TABLE IF NOT EXISTS bill_items (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "bill_id INTEGER NOT NULL," +
                    "barcode TEXT NOT NULL," +
                    "product_name TEXT NOT NULL," +
                    "marked_price REAL NOT NULL," +
                    "sold_price REAL NOT NULL," +
                    "quantity INTEGER NOT NULL," +
                    "FOREIGN KEY(bill_id) REFERENCES bills(id) ON DELETE CASCADE");

            System.out.println("Tables initialized");
        } catch (SQLException e) {
            System.err.println("Table Init Error: " + e.getMessage());
        }
    }
}
