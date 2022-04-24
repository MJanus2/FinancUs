package com.financus;

import com.financus.jdbc.DBconnector;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws IOException {
        DBconnector.connect();
        SessionFactory sessionFactory =
                new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Stock stock = YahooFinance.get("ETFBS80TR.WA");
        BigDecimal price = stock.getQuote(true).getPrice();
        BigDecimal change = stock.getQuote().getChangeInPercent();
        BigDecimal peg = stock.getStats().getPeg();
        BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();
        stock.print();
        System.out.println(price);
    }
}
