package com.Streams.IntermediateOperation;

import com.Streams.Intro;

import java.util.ArrayList;
import java.util.List;

public class FilteringOperation {
    public static void main(String[] args) {
       //List Of Integers
       List<Integer> intList=new ArrayList<>();
       intList.add(12);
       intList.add(23);
       intList.add(1);
       intList.add(2);
        intList.add(9);
        intList.add(10);
        intList.add(12);

       intList.stream().filter(s->s>2 && s<10).forEach(System.out::println);
        System.out.println("Checking Original Data Structure");

        intList.stream().forEach(System.out::println);


    }
}
