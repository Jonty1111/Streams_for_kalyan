package com.Task;

import com.comparatoranonymous.Person;

import java.util.ArrayList;
import java.util.List;

public class Ques4 {
    public static void main(String[] args) {
        List<Desh> stringList=new ArrayList<>();
        stringList.add(new Desh("Singapore", "Asia"));
        stringList.add(new Desh("India", "Asia"));
        stringList.add(new Desh("USA", "America"));
        stringList.add(new Desh("UK", "Europe"));

        stringList.add(new Desh("Australia", "Asia"));


        boolean anyAsia=stringList.stream().anyMatch(s->s.getRegion().equals("Asia"));
        System.out.println("List COntains the person from Asia: " + anyAsia);


        boolean allPersons=stringList.stream().allMatch(s->s.getRegion().equals("Europe"));
        System.out.println("Check from Europe : " + allPersons);


        boolean noPersons=stringList.stream().noneMatch(s->s.getRegion().equals("Asia"));
        System.out.println("Check whether if none of the person from asia : " + noPersons);

    }
}

class  Desh{

    String country;
    String region;

    public Desh(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Desh(String country, String region) {
        this.country = country;
        this.region = region;
    }

    @Override
    public String toString() {
        return "Desh{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
