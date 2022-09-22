package com.Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<Emp> lst=new ArrayList<>();
        lst.add(new Emp("Jonty",29,2333));
        lst.add(new Emp("Kalyan",19,222));
        lst.add(new Emp("Gokul",21,2222));
        lst.add(new Emp("Abhimanyu",21,44444));
        lst.add(new Emp("Abhimanyu",21,44444));
        //Max Salary
        Optional<Emp> max1=lst.stream().max(Comparator.comparing(p->p.getSalary()));
        //Min Salary
        Optional<Emp> min1=lst.stream().min(Comparator.comparing(p->p.getSalary()));
        //Avg Salary
        Double avgSalary = lst.stream().collect(Collectors.averagingInt(Emp::getSalary));
        //Oldest Employee among all
        Optional<Emp> min2=lst.stream().max(Comparator.comparing(p->p.getAge()));
        //Method-1 Sum of Salary of All
        long sumSalary=lst.stream().collect(Collectors.summingInt(emp-> emp.getSalary()));

        System.out.println("Maximum Salary : " +max1);
        System.out.println("Minimum Salary : " +min1);
        System.out.println("Sum of ALl Salary : "+sumSalary);
        System.out.println("Oldest Person in the List :" + min2);
        System.out.println("Avg Salary of All Employees : " + avgSalary);

        //Method-2 Sum of Salary of All Employees
        int SumofAllSalary = lst.stream().mapToInt(e->e.getSalary()).sum();
        System.out.println(SumofAllSalary);


    }
}

class Emp {

    String name;
    int age;
    int salary;

    Emp(String name)
    {
        this.name=name;
    }

    public Emp()
    {   }

    public Emp(String name,int age,int salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +

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


}
