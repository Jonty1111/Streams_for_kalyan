package com.Task;

public class Employee {
    String name;
    int id;
    String country;
    public int getId(int id)
    {
        return id;
    }
    public Employee(int id,String name,String country)
    {
        this.name=name;
        this.id=id;
        this.country=country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", country='" + country + '\'' +
                '}';
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setId(int age)
    {
        this.id=id;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public String getCountry()
    {
        return country;
    }



}
