package com.Streams.TerminalOperations;

import com.comparatoranonymous.Person;

import java.util.ArrayList;
import java.util.List;

public class MatchingOperations {

    public static void main(String[] args) {
        //Intermediate Operations are also called Lazy operations
        //Matching Operations are
        //AnyMatch
        //          -> true if any element matches -> true
        //          ->if no element matches->flase
        //          stream is empty->false
        List<Person> stringList=new ArrayList<>();
        stringList.add(new Person("Jonty",29,"India"));
        stringList.add(new Person("Joaaaty",21,"Dubai"));
        stringList.add(new Person("Jo2y",18,"USA"));
        stringList.add(new Person("Jo",17,"UK"));

        //1.Check if any person who belongs to India
        boolean anyIndian=stringList.stream().anyMatch(s->s.getCountry().equals("India"));
        System.out.println("List COntains the person from India: " + anyIndian);

        //2.Check if all persons are less than the age of 30
        boolean allPersons=stringList.stream().allMatch(s->s.getAge()<30);
        System.out.println("Check whether all person age is less than 30 : " + allPersons);

        //3.check the none of the persons name starts with letter k
        boolean noPersons=stringList.stream().noneMatch(s->s.getName().startsWith("k"));
        System.out.println("Check whether if none of the person name starts with first letter k : " + noPersons);






        //AllMatch
        //          -> every element matches with the input -> true
        //          -> stream is empty -> true
        //          -> Any Single Element does'nt match -> false
        //NoneMatch
        //          -> If no element matches -> true, if the stream is empty ->  true
        //            if the stream is empty->true
        //              if single element match-> false


    }
}
