package com.financus;

import com.financus.jdbc.DBconnector;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        DBconnector.connect();
        SessionFactory sessionFactory =
                new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }
}
