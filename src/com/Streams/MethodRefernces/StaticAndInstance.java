package com.Streams.MethodRefernces;

import com.Streams.MethodReferences;

import java.util.ArrayList;
import java.util.List;

public class StaticAndInstance {

    public static int getLength(String string){
        return string.length();
    }

    public static int getStaticLength(String str)
    {
        return str.length();
    }
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Man");
        stringList.add("Women");
        stringList.add("Boy");
        stringList.add("Girl");
        //General Static Method
        stringList.stream().map(s -> StaticAndInstance.getLength(s)).forEach(System.out::print);
        System.out.println();
        //Static method reference
        stringList.stream().map(StaticAndInstance::getLength).forEach(System.out::print);

        StaticAndInstance obj1=new StaticAndInstance();
        //General Satatic Method
        stringList.stream().mapToInt(s->StaticAndInstance.getStaticLength(s)).forEach(System.out::println);

        //Static Method Refernce
        stringList.stream().mapToInt(StaticAndInstance::getStaticLength).forEach(System.out::println);

        stringList.stream().mapToInt(s->obj1.getLength(s)).forEach(System.out::println);

        //stringList.stream().mapToInt(obj1::getStaticLength).forEach(System.out::println);



    }

}
