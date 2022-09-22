package com.Streams.IntermediateOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OnlyInitialUse {
    public static void main(String[] args) {
      /*  String name="Hello World How Are You";
        if (name.length() == 0)
            System.out.println("Nothing is their");
        System.out.print(name.charAt(0));
        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.print(
                        name.charAt(i + 1));
*/

        String name="Hello World How Are You";
        List<String> strings = Arrays.stream(name.split(" ")).collect(Collectors.toList());
        strings.stream().map(s -> s.charAt(0)).forEach(System.out::print);


        System.out.println();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("How");
        stringList.add("Are");
        stringList.add("You?");
        stringList.stream().map(s -> s.charAt(0)).forEach(System.out::print);
        System.out.println();
        System.out.println(stringList.stream().reduce("", (a, b) -> a+b.charAt(0)+""));
    }
}
