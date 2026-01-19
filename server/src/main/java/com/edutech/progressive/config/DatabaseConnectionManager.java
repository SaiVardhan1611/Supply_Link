package com.edutech.progressive.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// import javax.management.RuntimeErrorException;

public class DatabaseConnectionManager {
    private static final Properties properties = new Properties();

    static{
        loadProperties();
    }

    public static void loadProperties() {
        try {
            InputStream input = DatabaseConnectionManager.class.getClassLoader()
                    .getResourceAsStream("application.properties");

            if (input == null) {
                throw new RuntimeException("application.properties file not found");
            }

            properties.load(input);

        } catch (IOException e) {
            throw new RuntimeException("Error loading application.properties", e);
        }
    }

    public static Connection getConnection() {
        try {
            String url = properties.getProperty("spring.datasource.url");
            String username = properties.getProperty("spring.datasource.username");
            String password = properties.getProperty("spring.datasource.password");
            //String driver = properties.getProperty("spring.datasource.driver-class-name");

            //Class.forName(driver);

            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException("Database connection failed", e);
        }
    }

}
