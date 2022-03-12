package com.financus.realestates;

public class Person {
    enum Gender{
        MĘŻCZYZNA, KOBIETA;
    }
    private int id;
    private int monthlySalary;
    private int monthlyLivingCosts;
    private Gender gender;

    public Person(int id, int monthlySalary, int monthlyLivingCosts,Person.Gender gender) {
        this.id = id;
        this.monthlySalary = monthlySalary;
        this.monthlyLivingCosts = monthlyLivingCosts;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getMonthlyLivingCosts() {
        return monthlyLivingCosts;
    }
}
