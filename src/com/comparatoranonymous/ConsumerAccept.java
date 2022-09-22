package com.comparatoranonymous;

import java.util.function.Consumer;

public class ConsumerAccept {
    public static void main(String[] args) {

        Consumer<String> stringConsumer= s-> System.out.println(s);

        stringConsumer.accept("Hello How Are you?");

        Consumer<Integer> IntegerConsumer= i-> System.out.println("Integer value = " + i);

        IntegerConsumer.accept(5);

        Consumer<String> employee1= (arg) -> System.out.println("My name is Jonty " + arg);
        Consumer<String> employee2= (arg) -> System.out.println("I am from jakhal " + arg);

        employee1.andThen(employee2).accept("Hello");

    }
}
