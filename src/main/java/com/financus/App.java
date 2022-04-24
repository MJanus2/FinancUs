package com.financus;

import com.financus.jdbc.DBconnector;
import com.financus.securities.NBPCurrencyAPI;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.net.URISyntaxException;

public class App {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        DBconnector.connect();

        SessionFactory sessionFactory =
                new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        NBPCurrencyAPI nbpCurrencyAPI = new NBPCurrencyAPI();
        System.out.println(nbpCurrencyAPI.getCurrencyRateFromASpecificDate("2022-04-04"));

    }
}
