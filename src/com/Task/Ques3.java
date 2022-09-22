package com.Task;

import java.util.ArrayList;
import java.util.List;

public class Ques3 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1, "Ravi","Delhi"));
        list.add(new Employee(2, "Raj","Mumbai"));
        list.add(new Employee(3, "Rekha","Chennai"));
        list.add(new Employee(4, "Ram","Siliguri"));
        list.add(new Employee(5, "Raj","Chennai"));
        list.add(new Employee(6, "Raj","Mumbai"));
        list.add(new Employee(7, "Rekha","Delhi"));
        list.stream().distinct().skip(1).forEach(System.out::println);
    }
}
