package com.Streams.MethodRefernces;

import java.util.ArrayList;
import java.util.List;

class Company{
    String companyName;
    int year;

    Company(String companyName,int year)
    {
        this.companyName=companyName;
        this.year=year;
    }
    public String getCompanyName()
    {
        return companyName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", year=" + year +
                '}';
    }
}
public class ArbritaryRefernces {
    public static void main(String[] args) {

        List<Company> lst=new ArrayList<>();
        lst.add(new Company("Wipro",4));
        lst.add(new Company("By",
                5));
        //get the year of company in  a stream
        int totalNumberOfYears= lst.stream().mapToInt(s->s.getYear()).sum();
        System.out.println(totalNumberOfYears);
        //By Using Method Refernce
        //Arbritary method refernce
        int totalNumberOfYearsWithMethodRefernces=lst.stream().mapToInt(Company::getYear).sum();
        System.out.println(totalNumberOfYearsWithMethodRefernces);


    }
}
