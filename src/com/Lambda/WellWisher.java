package com.Lambda;

public class WellWisher {

    public static void sayHello(Language language)
    {
        language.wish();
    }

    public static void main(String[] args) {
      /*
        Language englishObj =new English();
        sayHello(englishObj);

        Language hindiObj =new Hindi();
        sayHello(hindiObj);

        Language marathiObj =new Marathi();
        sayHello(marathiObj);
      */



        /*
        //Anonymous Class objects
        sayHello(new Language() {
            @Override
            public void wish() {
                System.out.println("Namaskaar");
            }
        });

        sayHello(new Language() {
            @Override
            public void wish() {
                System.out.println("hello How are you");

            }
        });
        */

        //Lambda Expression here we are not binding anything
        sayHello(   () -> System.out.println("Namaskaar marathi"));
        sayHello(   () -> System.out.println("Hello how are you"));
        sayHello(   () -> System.out.println("Namaste Hindi"));



    }
}
