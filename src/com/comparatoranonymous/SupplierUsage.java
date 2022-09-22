package com.comparatoranonymous;

import java.util.function.Supplier;

public class SupplierUsage {
    static String name="Jonty";

    public static void main(String[] args) {

      /*  int num=name.length();
        Supplier<Integer> intSupplier= ()->name.length();
        Supplier<Boolean> booleanSupplier= ()-> name.length() == 4;
        Supplier<String> stringSupplier=()->name.toString();
*/
        Employee emp1=new Employee("Jonty",29);
        System.out.println(emp1.getName());

        Payroll payroll=new Payroll("Jonty",29);
        System.out.println(emp1.getName());

        Supplier<Employee> empSupplier=()->new Employee("Arjun",23);
        Supplier<Payroll> PayrollSupplier=()->new Payroll("Arjun",23);


        /*
        System.out.println("num:" +num);
        System.out.println("intSupplier:" +intSupplier.toString());
        System.out.println("booleanSupplier:" +booleanSupplier);
        System.out.println("stringSupplier:" +stringSupplier);
  */  }
}

class Employee{
    private String name;
    private int age;
    Employee(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

}

class Payroll{
    private String name;
    private int age;
    Payroll(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

}
