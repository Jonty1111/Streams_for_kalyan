package com.Streams.TerminalOperations;

import com.comparatoranonymous.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingOperations {
    public static void main(String[] args) {
        //It returns element as a return
        //FindFirst
        ArrayList<Person2> lst=new ArrayList<>();
        lst.add(new Person2("John",29,"India"));
        lst.add(new Person2("Kal",21,"Dubai"));
        lst.add(new Person2("Abh",18,"USA"));
        lst.add(new Person2("J1S",27,"UK"));
        lst.add(new Person2("JS",17,"UK"));
        lst.add(new Person2("JS2",17,"UK"));

        //FindFirst Lazy Stream Operations
        Optional<Person2> p= lst.stream()
                .filter(s-> s.getCountry().equals("UK"))
                .findFirst();

        if(p.isPresent())
        {
            System.out.println(p);
        }
        else{
            System.out.println("No Records Found");
        }

        //FindAny
        Optional<Person2> p2= lst.stream()
                .filter(s-> s.getCountry().equals("UK"))
                .findAny();

        if(p2.isPresent())
        {
            System.out.println(p2);
        }
        else{
            System.out.println("No Records Found");
        }

    }
}
class Person2 {

    String name;
    int age;
    String country;
    Person2(String name)
    {
        this.name=name;
    }

    public Person2()
    {   }

    public Person2(String name,int age,String country)
    {
        this.name=name;
        this.age=age;
        this.country=country;
    }

    @Override
    public String toString() {
        return "Person2{" + "name='" + name + '\'' + ", age=" + age + ", country='" + country + '\'' + '}';
    }


    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getCountry()
    {
        return country;
    }




}

