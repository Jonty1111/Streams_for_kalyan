package com.Streams.CollectorsCollectionsOperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class AggregationOperations {

    public static void main(String[] args) {
        //
        List<Person5> lst=new ArrayList<>();
        lst.add(new Person5("Jonty",29,2333,"Ind"));
        lst.add(new Person5("Kalyan",19,222,"us"));
        lst.add(new Person5("Gokul",21,2222,"su"));
        lst.add(new Person5("Abhimanyu",21,44444,"china"));
        lst.add(new Person5("Abhimanyu",21,44444,"china"));

        //Counting
        long count=lst.stream().filter(emp->emp.getAge()>19).collect(Collectors.counting());
        System.out.println(count);
        //Summing
        long sumSalary=lst.stream().collect(Collectors.summingInt(emp-> emp.getSalary()));
        System.out.println(sumSalary);
        //ToIntFunction
        double averageSalary=lst.stream().collect(Collectors.averagingInt(emp->emp.getSalary()));
        System.out.println(averageSalary);
        double intAverageSalary=lst.stream().collect(Collectors.averagingLong(emp->emp.getSalary()));
        System.out.println(intAverageSalary);
        //minBy
        Optional<Person5> minSalary=lst.stream().collect(Collectors.minBy(Comparator.comparing(Person5::getSalary)));
        System.out.println(minSalary);

        Optional<Person5> minSalaryWithAgelessthan30=lst.stream().filter(s->s.getAge()<30).collect(Collectors.minBy(Comparator.comparing(Person5::getSalary)));
        System.out.println(minSalaryWithAgelessthan30);

        //maxBy
        Optional<Person5> maxSalary=lst.stream().collect(Collectors.maxBy(Comparator.comparing(Person5::getSalary)));
        System.out.println(maxSalary);

        //Joining Method
        String joinedString= Stream.of("I am"," Jonty ","Singla").collect(Collectors.joining());
        System.out.println(joinedString);

        String joinString = lst.stream().map(p->p.getName()).collect(Collectors.joining());
        System.out.println(joinString);
    }
}


class Person5 {

    String name;
    int age;
    int salary;
    String country;
    Person5(String name)
    {
        this.name=name;
    }

    public Person5()
    {   }

    public Person5(String name,int age,int salary,String country)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.country=country;
    }

    @Override
    public String toString() {
        return "Person5{" +
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

