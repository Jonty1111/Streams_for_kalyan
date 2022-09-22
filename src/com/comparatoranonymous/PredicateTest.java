package com.comparatoranonymous;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest {
    static boolean isPersonEligibleForVoting(Person person, Predicate<Person> predicate)
    {
        return predicate.test(person);
    }

    static boolean isPersonEligibleForRetirement(Person person, Predicate<Person> predicate)
    {
        return predicate.test(person);
    }
/*
    static boolean isPersonEligibleForVotingList(ArrayList<Person> person, Predicate<Person> predicate)
    {
        return predicate.test(person);
    }*/
    public static void main(String[] args) {

/*
        Person person=new Person("jonty",29,"India");
        Predicate<Person> predicate=p-> p.getAge()>18;
        boolean eligible=isPersonEligibleForVoting(person,predicate);
        System.out.println("Person is elgible for voting : " + eligible);

        Predicate<Person> predicate1=p-> p.getAge()>60;
        boolean eligible1=isPersonEligibleForRetirement(person,predicate1);
        System.out.println("Person is elgible for Retirement : " + eligible1);
*/


        List<Person> persons=new ArrayList<>();
        persons.add(new Person("jonty",29,"India"));
        persons.add(new Person("Kalyan",19,"pak"));
        persons.add(new Person("Gokul",21,"afg"));
        persons.add(new Person("Abhi",21,"aus"));
         Predicate<Person> predicate=p-> p.getAge()>18;
       persons.forEach(person1->System.out.println(person1.getName() +"is elegible for voting -> " + isPersonEligibleForVoting(person1,predicate)));
       /*
        persons.stream().filter(s->s.getAge()>18 ).forEach(System.out::println);
*/
/*
        List<String> list =new ArrayList<>();
        list.add("A");
        list.add("E");
        list.add("I");
        list.add("o");
        list.add("U");
        list.add("VOWELS");
        System.out.println();
        Stream<String> checkStreamList =list.stream();
        checkStreamList.forEach(s-> System.out.println(s));
        */

    }
}
