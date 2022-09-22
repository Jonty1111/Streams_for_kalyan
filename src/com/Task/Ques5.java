package com.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ques5 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1, "Ravi","Delhi"));
        list.add(new Employee(2, "Raj","Mumbai"));
        list.add(new Employee(3, "Rekha","Chennai"));
        list.add(new Employee(4, "Ram","Siliguri"));
        list.add(new Employee(5, "Raj","Chennai"));
        list.add(new Employee(6, "Raj","Mumbai"));
        list.add(new Employee(7, "Rekha","Delhi"));
        Optional<Employee> person = list.stream().filter(p->p.getCountry().equals("Mumbai")).findFirst();
        System.out.println(person.isPresent() ? person : "No Data Found");
    }
}
