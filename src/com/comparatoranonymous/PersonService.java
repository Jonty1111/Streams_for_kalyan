package com.comparatoranonymous;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService {

    public static List<Person> getPersons(List<Person> person)
    {
        /*
        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        */

        //using Lambda Expression
        Collections.sort(person,((o1, o2) -> o1.getName().compareTo(o2.getName())));
        return person;
    }

}
