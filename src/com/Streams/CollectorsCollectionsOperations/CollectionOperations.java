package com.Streams.CollectorsCollectionsOperations;

import com.comparatoranonymous.Person;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionOperations {

    public static void main(String[] args) {


    //1.Collect Method
    List<Person4> lst=new ArrayList<>();
     lst.add(new Person4("Jonty",29,2333,"Ind"));
     lst.add(new Person4("Kalyan",19,222,"us"));
     lst.add(new Person4("Gokul",21,2222,"su"));
     lst.add(new Person4("Abhimanyu",21,44444,"china"));
     lst.add(new Person4("Abhimanyu",21,44444,"china"));
        //List
        List<String> allNames=lst.stream().map(person->person.getName()).collect(Collectors.toList());
        System.out.println(allNames);
        //Set
        Set<String>personname= lst.stream().map(p->p.getCountry()).collect(Collectors.toSet());
        System.out.println(personname);
        //Linked List   Constructor reference
        LinkedList<String> namePerson= lst.stream().map(s->s.getName()).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(namePerson);
        //Map
        Map<String,Integer> personMap= lst.stream().collect(Collectors.toMap(s->s.getName(),s->s.getName().length()));
        System.out.println(personMap);

        //DownStream
        List<String> notChangableList=lst.stream().map(s->s.getName()).collect(Collectors.collectingAndThen(Collectors.toList(),Collections::unmodifiableList));




    }
}

class Person4 {

    String name;
    int age;
    int salary;
    String country;
    Person4(String name)
    {
        this.name=name;
    }

    public Person4()
    {   }

    public Person4(String name,int age,int salary,String country)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.country=country;
    }

    @Override
    public String toString() {
        return "Person4{" +
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
