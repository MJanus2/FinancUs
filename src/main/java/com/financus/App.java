package com.financus;

import pl.FinancUs.goals.DBconnection.MysqlConnect;
import pl.FinancUs.goals.DBconnection.QueriesGoals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class App {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException, ParseException, SQLException {
        MysqlConnect.connect();
        ResultSet resultSet = QueriesGoals.executeSelect("SELECT * FROM goal");
        try{
            while (resultSet.next()){
                System.out.println("Goal title: " + resultSet.getString("Title"));

            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }

//        DBconnector.connect();
//        SessionFactory sessionFactory =
//                new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//        NBPCurrencyAPI nbpCurrencyAPI = new NBPCurrencyAPI();
//        System.out.println(nbpCurrencyAPI.getCurrencyRateFromASpecificDate("2022-04-04"));

//        com.financus.realestates.ExcelDataDownloader excelDataDownloader = new ExcelDataDownloader();
//        System.out.println(excelDataDownloader.getColumnIndexForCity(excelDataDownloader.chooseFilePath(), 2, "Łódź"));

//        for(Double prices : excelDataDownloader.createCityPrices(excelDataDownloader.chooseFilePath(),
//                        excelDataDownloader.getAdditionalStream(), 2, "Łódź")){
//            System.out.println(prices);
//        }
//
//        for(String periods : excelDataDownloader.createCityPeriods
//                (excelDataDownloader.chooseFilePath(), 2)){
//            System.out.println(periods);
//        }

//         excelDataDownloader.showDates();

    }
}
