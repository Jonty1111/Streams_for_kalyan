package com.Streams.CollectorsCollectionsOperations;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingOperations {
    public static void main(String[] args) {
        //Grouping
        List<Person6> lst=new ArrayList<>();
        lst.add(new Person6("Jonty",29,2333,"Ind"));
        lst.add(new Person6("Kalyan",19,222,"us"));
        lst.add(new Person6("Gokul",21,2222,"su"));
        lst.add(new Person6("Abhimanyu",21,44444,"china"));
        lst.add(new Person6("Abhimanyu",21,44444,"china"));

        //GroupBy
        Map<String,List<Person6>> employeeMap=lst.stream().collect(Collectors.groupingBy(Person6::getCountry));
        System.out.println(employeeMap);

        //GroupCountryWithMaxSalary
        Map<String, Optional<Person6>> GroupCountryWithMaxSalary=lst.stream().collect(Collectors.groupingBy(Person6::getCountry,Collectors.maxBy(Comparator.comparingInt(Person6::getSalary))));
        System.out.println(GroupCountryWithMaxSalary);



    }
}


class Person6 {

    String name;
    int age;
    int salary;
    String country;
    Person6(String name)
    {
        this.name=name;
    }

    public Person6()
    {   }

    public Person6(String name,int age,int salary,String country)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.country=country;
    }

    @Override
    public String toString() {
        return "Person6{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", country='" + country + '\'' +
                '}';
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getSalary()
    {
        return salary;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
