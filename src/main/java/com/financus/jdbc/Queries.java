package com.financus.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Queries {
    public static ResultSet executeSelect(String selectQuery){
        try {
            Connection connection = DBconnector.connect();
            Statement statement = connection.createStatement();
            return statement.executeQuery(selectQuery);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void executeQuery(String query){
        try {
            Connection connection = DBconnector.connect();
            Statement statement = connection.createStatement();
            statement.executeQuery(query);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void executeUpdate(String update){
        try {
            Connection connection = DBconnector.connect();
            Statement statement = connection.createStatement();
            statement.executeUpdate(update);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
