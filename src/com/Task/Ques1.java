package com.Task;

import java.util.ArrayList;
import java.util.List;

public class Ques1 {
    public static int checkLegnth(String str){
        return str.length();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.stream().map(Ques1::checkLegnth).forEach(System.out::println);


    }
}
