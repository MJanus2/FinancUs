package com.financus.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnector {

    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/financus",
                    "root", "1234");
            System.out.println("Connected");
            return connection;
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
        return null;
    }
}


