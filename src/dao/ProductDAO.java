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

    public boolean addProduct(Product product) throws SQLException {
        String barcode = product.getBarcode();
        System.out.println("barcode");
        try (Connection connection = Database.getInstace().getConnection()) {

            if (barcode != null && !barcode.isBlank()) {
                String checkSql = "SELECT COUNT(*) FROM products WHERE barcode = ?";
                try (PreparedStatement checkStmt = connection.prepareStatement(checkSql)) {
                    checkStmt.setString(1, barcode);
                    try (ResultSet rs = checkStmt.executeQuery()) {
                        if (rs.next() && rs.getInt(1) > 0) {
                            System.out.println("❌ Barcode already exists: " + barcode);
                            return false;
                        }
                    }
                }
            }

            String insertSql = "INSERT INTO products (barcode, si_name, en_name, weladapala_mila, ape_mila) "
                    + "VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(insertSql)) {
                if (barcode == null || barcode.isBlank()) {
                    pstmt.setNull(1, java.sql.Types.NULL);
                } else {
                    pstmt.setString(1, barcode);
                }
                pstmt.setString(2, product.getSiName());
                pstmt.setString(3, product.getEnName());
                pstmt.setDouble(4, product.getWeladapalaMila());
                pstmt.setDouble(5, product.getApeMila());

                pstmt.executeUpdate();
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;

        }
    }

    public List<Product> getAllProducts() throws SQLException {

        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM products ORDER BY id ASC";

        Connection conn = Database.getInstace().getConnection();
        try (PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Product p = new Product(
                        rs.getString("barcode"),
                        rs.getString("si_name"),
                        rs.getString("en_name"),
                        rs.getDouble("weladapala_mila"),
                        rs.getDouble("ape_mila")
                );
                p.setId(rs.getInt("id"));
                products.add(p);
            }

        } catch (SQLException e) {
            System.err.println("❌ Fetch Products Error: " + e.getMessage());
        }
        return products;
    }

    public List<Product> searchProducts(String keyword) throws SQLException {

        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM products WHERE barcode LIKE ? "
                + "OR en_name LIKE ? OR si_name LIKE ? "
                + "ORDER BY id DESC";

        Connection connection = Database.getInstace().getConnection();
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            String searchKey = "%" + keyword + "%";

            pstmt.setString(1, searchKey);
            pstmt.setString(2, searchKey);
            pstmt.setString(3, searchKey);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getString("barcode"),
                        rs.getString("si_name"),
                        rs.getString("en_name"),
                        rs.getDouble("weladapala_mila"),
                        rs.getDouble("ape_mila"));

                products.add(p);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }

    public boolean deleteProduct(String id) throws SQLException {
        Connection connection = Database.getInstace().getConnection();
        try (PreparedStatement pstmt = connection.prepareStatement("DELETE FROM products WHERE id = ?")) {
            pstmt.setString(1, id);
            int affectedRows = pstmt.executeUpdate();

            return affectedRows > 0;

        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateApeMila(int id, double newPrice) {
        String sql = "UPDATE products SET ape_mila = ? WHERE id = ?";
        try (Connection conn = Database.getInstace().getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, newPrice);
            pstmt.setInt(2, id);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("❌ Update Product Error: " + e.getMessage());
            return false;
        }
    }

    public boolean updateWeladapalaMila(int id, double price) {
        String sql = "UPDATE products SET weladapala_mila = ? WHERE id = ?";
        try (Connection conn = Database.getInstace().getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, price);
            stmt.setInt(2, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("❌ Update Product Error: " + e.getMessage());
            return false;
        }
    }
}
