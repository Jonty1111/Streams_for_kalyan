package com.Streams.IntermediateOperation;

import java.util.ArrayList;
import java.util.List;

public class SlicingOperations {

    public static void main(String[] args) {
        //Distinct Method(Pick The Unique Element)

        //Remove Duplicates
        List<String> stringList=new ArrayList<>();
        stringList.add("Jonty");
        stringList.add("Joaaaty");
        stringList.add("Jo2y");
        stringList.add("Jo");
        stringList.add("Joaaaty");
        stringList.add("Jo2y");
        stringList.add("Jos1");

        stringList.stream().distinct().forEach(System.out::println);
        System.out.println();
        //Limit
        stringList.stream().distinct().limit(3).forEach(System.out::println);
        //Skip
        System.out.println();
        stringList.stream().distinct().limit(3).skip(1).forEach(System.out::println);

    }
}
