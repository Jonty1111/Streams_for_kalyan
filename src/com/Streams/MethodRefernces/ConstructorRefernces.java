package com.Streams.MethodRefernces;

import java.util.ArrayList;
import java.util.List;
class Company1{
    String companyName;


    Company1(String companyName)
    {
        this.companyName=companyName;

    }
    public String getCompanyName()
    {
        return companyName;
    }


    @Override
    public String toString() {
        return "Company1{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
public class ConstructorRefernces {

    public static void main(String[] args) {

        List<String> lst=new ArrayList<>();

        lst.add("Wipro");
        lst.add("BY");
        lst.add("Oracle");
        lst.add("Natixis");
        lst.add("HFL");
        lst.add("peoplestrong");
        lst.add("Bain and company");
        lst.add("HCL");

        lst.stream().map(Company1::new).forEach(System.out::println);
        lst.stream().map(name->new Company1(name)).forEach(System.out::println);


    }
}
