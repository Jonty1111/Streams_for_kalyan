package com.Streams.IntermediateOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConsiderOnlyPositive {
    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        intList.add(12);
        intList.add(23);
        intList.add(1);
        intList.add(2);
        intList.add(9);
        intList.add(10);
        intList.add(12);
        intList.add(-2);
        intList.add(-9);
        intList.add(-10);
        intList.add(0);
        List<Integer> onlypositiveones=intList.stream().filter(s->(s>0)).collect(Collectors.toList());
        System.out.println(onlypositiveones);
        System.out.println(onlypositiveones.stream().reduce(0,(a,b)->(a+b)));

    }
}
