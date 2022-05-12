package com.financus.finance.realestates;

import java.util.ArrayList;

public class PersonCollection {
    ArrayList<Person> persons = new ArrayList<>();

    public void addPersonToArrayList(Person person) {
        persons.add(person);
    }

    public ArrayList<Person> getPerson() {
        return persons;
    }

    public void deletePerson(int id) {
        persons.removeIf(person -> person.getId() == id);
    }
}

