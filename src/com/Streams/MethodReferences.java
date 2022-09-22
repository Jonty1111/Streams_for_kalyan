package com.Streams;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences {

    public static int getLength(String str)
    {
        return str.length();
    }
    public static int getStaticLength(String str)
    {
        return str.length();
    }
    public static void main(String[] args) {
        List<String> lst=new ArrayList<>();
        lst.add("Jonty");
        lst.add("Joaaaty");
        lst.add("Jo2y");
        lst.add("Jo");
        //General Static Methods
        lst.stream().map(s->MethodReferences.getLength(s)).forEach(System.out::println);
        System.out.println();
        //Static Method References
        lst.stream().map(MethodReferences::getLength).forEach(System.out::println);

        MethodReferences obj1=new MethodReferences();
        lst.stream().mapToInt(s->obj1.getStaticLength(s)).forEach(System.out::println);
        System.out.println();
        //Static Method References
      //  lst.stream().mapToInt(obj1::getStaticLength).forEach(System.out::println);



    }

}
