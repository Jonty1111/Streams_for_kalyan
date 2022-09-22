package com.Streams.LazyEvaluation;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LazyEval {

    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        Optional<Integer> numbers=data.stream().filter(num->
        {
            System.out.println("Processing filter for greater number" + num);
         return num>3;
        }).
                filter(num->{
                    System.out.println("Processing filter for even number" + num);
                    return num%2==0;
                }).findAny()
                ;
        System.out.println(numbers.get());
        //for unsorted one parallel stream is good
        System.out.println();
        System.out.println("For Parallel Stream");
        System.out.println();

        Optional<Integer> numbers1=data.parallelStream().filter(num->
                {
                    System.out.println("Processing filter for greater number" + num);
                    return num>3;
                }).
                filter(num->{
                    System.out.println("Processing filter for even number" + num);
                    return num%2==0;
                }).findAny()
                ;
        System.out.println(numbers1.get());
        //Pick the First Element -> 1 -> It is greater than 3

        //Pick the Second Element -> 2 ->It is greater than 3

        //Pick the third Element -> 3 ->It is greater than 3

        //Pick the fourth Element -> 4 ->It is greater than 3

        //Pick the fifth Element -> 5 -> It is greater then 3


    }
}
