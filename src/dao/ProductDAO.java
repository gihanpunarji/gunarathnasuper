/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.Database;
import dto.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gihanpunarji
 */
public class ProductDAO {
    public boolean addProduct(Product product) {
        String sql = "INSERT INTO products (barcode, si_name, en_name, weladapala_mila, ape_mila)"
                + " VALUES (?, ?, ?, ?, ?)";
        Connection connection = Database.getInstace().getConnection();
        try(PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, product.getBarcode());
            pstmt.setString(2, product.getSiName());
            pstmt.setString(3, product.getEnName());
            pstmt.setDouble(4, product.getWeladapalaMila());
            pstmt.setDouble(5, product.getApeMila());
            
            pstmt.executeUpdate();
            return true;
            
        } catch(SQLException e) {
            System.out.println("Barcode exists");
           return false;
        }
    }
    
    
    public List<Product> getAllProducts() {
        
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM products ORDER BY id DESC";
        
        Connection conn = Database.getInstace().getConnection();
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Product p = new Product(
                    rs.getString("barcode"),
                    rs.getString("si_name"),
                    rs.getString("en_name"),
                    rs.getDouble("weladapala_mila"),
                    rs.getDouble("ape_mila")
                );
                products.add(p);
            }

        } catch (SQLException e) {
            System.err.println("❌ Fetch Products Error: " + e.getMessage());
        }
    return products;
    }
    
    public List<Product> searchProducts(String keyword) {

        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM products WHERE barcode LIKE ? "
                + "OR en_name LIKE ? OR si_name LIKE ? "
                + "ORDER BY id DESC";
        
        Connection connection = Database.getInstace().getConnection();
        try(PreparedStatement pstmt = connection.prepareStatement(sql)) {
            String searchKey = "%" + keyword + "%";
            
            pstmt.setString(1, searchKey);
            pstmt.setString(2, searchKey);
            pstmt.setString(3, searchKey);
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Product p = new Product(rs.getString("barcode"),
                rs.getString("si_name"),
                rs.getString("en_name"),
                rs.getDouble("weladapala_mila"),
                rs.getDouble("ape_mila"));
                
                products.add(p);

            }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        return products;
    } 

    public boolean deleteProduct(String barcode) {
        Connection connection = Database.getInstace().getConnection();
        try(PreparedStatement pstmt = connection.prepareStatement("DELETE FROM products WHERE barcode = ?")) {
            pstmt.setString(1, barcode);
            int affectedRows = pstmt.executeUpdate();

            return affectedRows > 0;
        
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean updateApeMila(String barcode, double newPrice) {
    String sql = "UPDATE products SET ape_mila = ? WHERE barcode = ?";
    try (Connection conn = Database.getInstace().getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setDouble(1, newPrice);
        pstmt.setString(2, barcode);
        return pstmt.executeUpdate() > 0;
    } catch (SQLException e) {
        System.err.println("❌ Update Product Error: " + e.getMessage());
        return false;
    }
}
}
