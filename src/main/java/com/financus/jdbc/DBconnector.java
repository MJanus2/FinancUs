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
            System.out.println("JDBC connected to MySQL database");
            return connection;
        } catch (SQLException exp) {
            exp.printStackTrace();
            System.out.println("JDBC - connection with MySQL database isn't possible");
        }
        return null;
    }
}


