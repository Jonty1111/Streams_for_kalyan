package com.Task;

import com.comparatoranonymous.Person;
import com.comparatoranonymous.PersonService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShopMain {
    public static void main(String[] args) {
        ArrayList<Shop> s = new ArrayList<Shop>();
        s.add(new Shop(218, "Pen"));
        s.add(new Shop(223, "Pencil"));
        s.add(new Shop(423, "Books"));
        s.add(new Shop(512, "Toy"));
        s.add(new Shop(723, "Bottle"));

        System.out.println("before sorting");
        for (Shop shop : s) {
            System.out.println(shop.getName() + " " + shop.getProductNo());
        }

        System.out.println();
        System.out.println("After sorting(sorted by Name)");

        // call the sort function
       /* List<Shop> sortedShops= ShopService.getShops(s);
        System.out.println("Shops After Sorting");

        for(Shop shop:sortedShops)
        {
            System.out.println("Shop Name: " + shop.getName());
        }*/

       Collections.sort(s, new ShopService());
        for (Shop shop : s) {
            System.out.println(shop.getName() + " " + shop.getProductNo());
        }
        System.out.println();
        System.out.println();
        System.out.println();
        Collections.shuffle(s);

        for (Shop shop : s) {
            System.out.println(shop.getName() + " " + shop.getProductNo());
        }
    }
}
