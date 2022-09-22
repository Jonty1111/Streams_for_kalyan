package com.comparatoranonymous;

public class Person {

     String name;
    int age;
    String country;
    Person(String name)
    {
        this.name=name;
    }

   public Person()
    {   }

    public Person(String name,int age,String country)
    {
        this.name=name;
        this.age=age;
        this.country=country;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", country='" + country + '\'' + '}';
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
