package com.introduction;

public class Methods implements Company,Tata,Mahindra{
    //Default Methods
    //Abstract Method
    public void insertCompany()
    {
        System.out.println("Inserting a Company");
    }

    //Abstratc method
    public void display() {
   // Mahindra.super.display();
    }
    //default method overridden
    @Override
    public void updateCompany()
    {
        System.out.println("updating the  update Company");
    }


    public void deleteCompany()
    {
        //Cann't oveeride the static method
    }

    public static void main(String[] args) {
        Methods obj1=new Methods();
        obj1.insertCompany();
        obj1.updateCompany();
        obj1.display();


        Methods obj2=new Methods();
        obj2.insertCompany();

        Company.deleteCompany();
        //Class Human
        //Object Name
        //Properties Email,Address
        //Methods Verify,Send Email
    }

}
