package com.financus;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.text.ParseException;

public class App {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException, ParseException, SQLException {


/*
// Kasia test code
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

        final GoalStructure goal= new GoalStructure.Builder()
                .withGoalID(1)
                .withGoalTitle("Dopracować projekt")
                .build();

        System.out.println(goal);

        WeatherTaker weatherTaker = new WeatherTaker();
        weatherTaker.takeWeather("Warsaw");
        weatherTaker.takeWeather("London");


            }
        }

 */
/*
// Mateusz test code

    DBconnector.connect();
    SessionFactory sessionFactory =
          new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    NBPCurrencyAPI nbpCurrencyAPI = new NBPCurrencyAPI();
    System.out.println(nbpCurrencyAPI.getCurrencyRateFromASpecificDate("2022-04-04"));
    com.financus.finance.realestates.ExcelDataDownloader excelDataDownloader = new ExcelDataDownloader();
    System.out.println(excelDataDownloader.getColumnIndexForCity(excelDataDownloader.chooseFilePath(), 2, "Łódź"));

    for(Double prices : excelDataDownloader.createCityPrices(excelDataDownloader.chooseFilePath(),
                       excelDataDownloader.getAdditionalStream(), 2, "Łódź")){
       System.out.println(prices);
    }

        (excelDataDownloader.chooseFilePath(), 2)){
        System.out.println(periods);
    }

    excelDataDownloader.showDates();

*/
    }
}