package com.comparatoranonymous;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons=new ArrayList<>();
        persons.add(new Person("Jonty",29,"India"));
        persons.add(new Person("Kalyan",19,"pak"));
        persons.add(new Person("Gokul",21,"afg"));
        persons.add(new Person("Abhi",21,"aus"));

        // getPerson Function

        List<Person> sortedPersons=PersonService.getPersons(persons);
        System.out.println("Person After Sorting");

        for(Person person:sortedPersons)
        {
            System.out.println("Person Name: " + person.getName());
        }

    }
}
