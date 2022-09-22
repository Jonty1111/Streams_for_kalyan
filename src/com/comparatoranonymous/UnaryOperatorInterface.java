package com.comparatoranonymous;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

    public static void main(String[] args) {
        Person person=new Person();

        UnaryOperator<Person> uo=(p) ->{
            p.name="Jonty";
            p.age=29;
            p.country="Ind";
            return p;

        };
        uo.apply(person);
        System.out.println("Person Name: "+person.getName() + "Person Age: " +person.getAge()) ;
    }
}
