package com.edutech.progressive.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.edutech.progressive.config.DatabaseConnectionManager;
import com.edutech.progressive.entity.Product;

public class ProductDAOImpl implements ProductDAO{

    private final String INSERT = "INSERT INTO Product(warehouse_id,product_name,product_description,quantity,price) VALUES(?,?,?,?,?) ";
    private final String SELECT = "SELECT * FROM Product WHERE product_id = ?";
    private final String UPDATE = "UPDATE Product SET warehouse_id = ?, product_name = ?, product_description = ?, quantity = ?, price = ? WHERE product_id = ?";
    private final String DELETE = "DELETE FROM Product WHERE product_id = ?";
    private final String GETALL = "SELECT * FROM Product";



    @Override
    public int addProduct(Product product) throws SQLException {
        
        Connection con = DatabaseConnectionManager.getConnection();
        PreparedStatement ps = con.prepareStatement(INSERT,Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,product.getWarehouseId());
        ps.setString(2,product.getProductName());
        ps.setString(3,product.getProductDescription());
        ps.setInt(4,product.getQuantity());
        ps.setDouble(5,product.getPrice());

        int rows = ps.executeUpdate();

        if(rows<=0){
            throw new SQLException();
        }

        ResultSet rs = ps.getGeneratedKeys();
        while(rs.next()){
            int key = rs.getInt(1);
            product.setProductId(key);
            return key;
        }

        return -1;
    }

    @Override
    public Product getProductById(int productId) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductById'");
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }

    @Override
    public void deleteProduct(int productId) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProduct'");
    }

    @Override
    public List<Product> getAllProducts() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllProducts'");
    }

}
