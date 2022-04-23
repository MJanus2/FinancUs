package com.financus.realestates;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "People")
public class Person {
    enum Gender{
        MĘŻCZYZNA, KOBIETA;
    }
    private int id;
    @Column(name = "monthly_salary")
    private int monthlySalary;
    @Column(name = "monthly_living_costs")
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
