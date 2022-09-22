package com.Task;

import com.comparatoranonymous.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShopService implements Comparator<Shop>{

    public int compare(Shop s1, Shop s2)
    {
        return s1.getName().compareTo(s2.getName());
    }


/*
    public static List<Shop> getShops(List<Shop> shop)
    {
        Collections.sort(shop,((o1, o2) -> o1.getName().compareTo(o2.getName())));
        return shop;
    }*/
}
