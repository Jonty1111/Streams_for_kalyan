package com.Streams.ParallelStreams;

import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        System.out.println("Printing Single Stream");
        Stream.of(1,2,3,4,5,6,9)
                .forEach(num-> System.out.println(num+" "+Thread.currentThread().getName()));

        System.out.println("Parallel Stream");
        Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
                .parallel()
                .forEach(num-> System.out.println(num+" "+Thread.currentThread().getName()));

        //When to Run Parallel Streams
        //1.Splitting is not more Expensive than doing the Work
        //2.Task Dispatch/Management costs btw the threads is not too high.
        //3.The Result Combination cost must not be high
        //4. NQ Formula -> N*Q -> 10000 -> N -> Number of data items , Q -> Amount of work per item


    }
}
