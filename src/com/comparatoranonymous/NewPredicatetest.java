package com.comparatoranonymous;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class NewPredicatetest {
    static boolean isPersonEligibleForVoting(Person person, Integer minAge , BiPredicate<Person,Integer> predicate)
    {
        return predicate.test(person,minAge);
    }

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

/*
        List<Person> persons=new ArrayList<>();
        persons.add(new Person("jonty",29,"India"));
        persons.add(new Person("Kalyan",19,"pak"));
        persons.add(new Person("Gokul",21,"afg"));
        persons.add(new Person("Abhi",21,"aus"));
        Predicate<Person> predicate=p-> p.getAge()>18;
        persons.forEach(person1->System.out.println(person1.getName() +"is elegible for voting -> " + isPersonEligibleForVoting(person1,predicate)));
*/

        Person person=new Person("Jonty",11,
                "ind");

        boolean eligible=isPersonEligibleForVoting(
                            person,
                            18,
                            (p,minAge)->{
                                    return p.getAge()>minAge;
                            }
                    );//Boolean Function Call

        System.out.println("Person is eligible for voting" + eligible);
    }
}
