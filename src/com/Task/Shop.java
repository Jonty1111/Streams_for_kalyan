package com.Task;

public class Shop {
    private int ProductNo;
    private String name;
    // constructor
    Shop(int ProductNo, String name)
    {
        this.ProductNo = ProductNo;
        this.name = name;
    }

    public int getProductNo()
    {
        return ProductNo;
    }
    public String getName()
    {
        return name;
    }

}
