package com.introduction;

public interface Company {
    void insertCompany();
    default void updateCompany()
    {
        System.out.println("Update the company details");
    }

    static void deleteCompany()
    {
        System.out.println("I am deleting the company details");
    }

}
