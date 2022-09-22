package com.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task34 {
    public static void main(String[] args) {
        List<String> books=new ArrayList<String>();
        books.add("abc");
        books.add("abasdsdcu");
        books.add("absdffc");
        books.add("abvefu");
        books.add("abu");
        //Get all the words that starts with letter a and ends with u from a book

        books.stream().filter(s->s.startsWith("a") && s.endsWith("u")).forEach(System.out::println);
        List<String> ans=books.stream().filter(s->s.startsWith("a") && s.endsWith("u")).collect(Collectors.toList());
        System.out.println(ans);


        //Stream<List<String>> normalStream=books.stream();
        //convert 2d thing into 1d array kind of thing like convert matrix into array
      //  Stream<String> flattenStream=normalStream.flatMap(s->s.stream());
       /* List<String> strings;
        strings = Arrays.stream(books.split("")).collect(Collectors.toList());

        int tot = books.stream()
                .flatMap(s -> s.toCharArray())
                .filter(c -> (c=='a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'))
                .count();

*/
        //Method not using FlatMap
        //////////////////////////////////Question-4////////////////////////////////////////////
        //Get the number of vowels in the List of Words
        List<String> l = new ArrayList<>();
        l.add("abcdef");
        l.add("abcussd");
        l.add("afgsdsd");
        l.add("xyzsdsd");
        l.add("abasdsdsd");
        int ans1 = 0;
        for(int i=0; i<l.size();i++)
        {
            int vow = 0;
            String str = l.get(i);
            vow = (int) str.chars().filter(ch -> (ch == 'a' || ch == 'e' ||
                    ch == 'i' || ch == 'o' || ch == 'u')).count();

            ans1 += vow;
            //System.out.println(vowels);
        }
        System.out.println(ans);



     /*
     //Try This
     int s1= (int)books.stream()
                .flatMap(s -> Arrays.asList(Arrays.stream(s.split("")))
        .filter(ch -> ch.equals("A") || ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U") ||
                        ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")).count();

    */



        //Method -2 using Flatmap
        List<String> stringList = new ArrayList<>();
        stringList.add("Ram");
        stringList.add("Shayam");
        stringList.add("Gita");
        stringList.add("Rita");
        stringList.add("Aalu");
        stringList.add("Kalu");
        stringList.add("Aaru");

        Stream<String> flatStringStream = stringList.stream().flatMap(s -> Arrays.asList(s.split("")).stream());
        Long count = flatStringStream.filter(ch -> ch.equals("A") || ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U") ||
                ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")).count();
        System.out.println(count);
    }

}
