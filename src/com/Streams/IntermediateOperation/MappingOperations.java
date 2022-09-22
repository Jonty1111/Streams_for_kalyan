package com.Streams.IntermediateOperation;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingOperations {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
        al.add(16);
        al.add(17);
        al.add(18);

        al.stream().map(s->s*2).forEach(System.out::println);

        List<String> list = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ",
                "Computer", "Science", "gfg");
        System.out.println();
        //list.stream().map(str -> str.length()).forEach(System.out::println);
        //list.stream().filter(str->str.length()<5).forEach(System.out::println);

        List<String> answer = list.stream().filter(str->str.length()<5).map(String::toUpperCase).
                collect(Collectors.toList());
        System.out.println(answer);
        //Array of String and return a new array of string that include those character length<5
  // and change those all of the array elements of string to uppercase
        System.out.println();
        System.out.println();

        List<String> stringList=new ArrayList<>();
        stringList.add("Jonty");
        stringList.add("Joaaaty");
        stringList.add("Jo2y");
        stringList.add("Jo");

        stringList.stream().map(s->s.length()).forEach(System.out::println);
        System.out.println(stringList);
        stringList.stream().mapToInt(s->s.length()).forEach(System.out::println);

        //Flattening a Stream

        List<List<String>> stringList2=new ArrayList<>();
        stringList2.add(Arrays.asList("abv","b","c"));
        stringList2.add(Arrays.asList("d","e","f"));
        stringList2.add(Arrays.asList("g","h","i"));
        stringList2.add(Arrays.asList("j","k","l"));

        //Stream<List<String>> flattenStream=stringList2.stream().filter(s->"a".equals(s));
        System.out.println();
        System.out.println();
        System.out.println("using FlatmAp");
        Stream<List<String>> normalStream=stringList2.stream();
        //convert 2d thing into 1d array kind of thing like convert matrix into array
        Stream<String> flattenStream=normalStream.flatMap(s->s.stream());
        flattenStream.forEach(System.out::println);
        //Stream<String> streamFiltered=flattenStream.filter(s->"a".equals(s));

        //streamFiltered.forEach(System.out::println);



        }

}
