package com.financus.finance.realestates;

import java.util.ArrayList;

public class PersonService {
    PersonCollection personCollection = new PersonCollection();

    private boolean isValid(int id, int monthlySalary, int livingCosts) {
        return PersonValidator.isIdValid(id)
                && PersonValidator.isMonthlySalaryAndLivingCostsValid(monthlySalary, livingCosts);
    }


    public boolean addPerson(int id, int monthlySalary, int monthlyLivingCosts, Person.Gender gender) {
        boolean isValid = isValid(id, monthlySalary, monthlyLivingCosts);
        if (isValid) {
            Person person = new Person(id, monthlySalary, monthlyLivingCosts, gender);
            personCollection.addPersonToArrayList(person);
        }
        return isValid;
    }


    public ArrayList<Person> getPerson() {
        return personCollection.getPerson();
    }


    public void deletePerson(int id) {
        personCollection.deletePerson(id);
    }




}


