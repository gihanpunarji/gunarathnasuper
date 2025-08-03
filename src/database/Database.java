/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author gihanpunarji
 */
public class Database {
    
    private static Database instance;
    private static Connection conn;
    private static final String URL = "jdbc:sqlite:pos.db";
    
    private Database() {
        try{
            conn = DriverManager.getConnection(URL);
            System.out.println("SQL lite Initialized");
            addTable();
        } catch (SQLException e) {
            System.out.println(e +" SQLite Exception");
        }
    }
    
    public static Database getInstace() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
    public Connection getConnection() {
        return conn;
       
    }
    
    private void addTable() {
        try (Statement stmt = conn.createStatement()) {
            // Products table
            stmt.execute("CREATE TABLE IF NOT EXISTS products (" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                         "barcode TEXT PRIMARY," +
                         "si_name TEXT NOT NULL," +
                         "en_name TEXT NOT NULL," +
                         "weladapala_mila REAL NOT NULL," +
                         "ape_mila REAL NOT NULL,");

            // Sales table
            stmt.execute("CREATE TABLE IF NOT EXISTS sales (" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                         "product_id INTEGER," +
                         "quantity INTEGER," +
                         "total REAL," +
                         "date TEXT," +
                         "FOREIGN KEY(product_id) REFERENCES products(id))");

            System.out.println("Tables initialized");
        } catch (SQLException e) {
            System.err.println("Table Init Error: " + e.getMessage());
        }
    }
    
    
}
