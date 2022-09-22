package com.Streams.IntermediateOperation;

import java.util.ArrayList;
import java.util.List;

public class SquareArrayList {
    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        intList.add(12);
        intList.add(23);
        intList.add(1);
        intList.add(2);
        intList.add(9);
        intList.add(10);
        intList.add(12);

        intList.stream().map(s->s*s).forEach(System.out::println);
    }
}
