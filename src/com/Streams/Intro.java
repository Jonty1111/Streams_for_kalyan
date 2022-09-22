package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Intro {

    public static void main(String[] args) {
        Stream<Integer> checkStream=Stream.of(3,4152,12,1,2,3);
        checkStream.forEach(s-> System.out.println(s));

        List<String> list =new ArrayList<>();
        list.add("A");
        list.add("E");
        list.add("I");
        list.add("o");
        list.add("U");
        list.add("VOWELS");
        System.out.println();
        Stream<String> checkStreamList =list.stream();
        checkStreamList.forEach(s-> System.out.println(s));
    }
}
