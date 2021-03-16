package com.company;
import java.lang.String;
public class Bakery extends Shop{
   // public String products[5];
    public static void get_products(){
        //String products[] ;
        for(int i=0; i<=4; i++){
            String products[] switch (i) {
                default -> throw new IllegalStateException("Unexpected value: " + i);
            }
            products[i] = "buleczka";
            System.out.println(products[i] + i);
        }
    }

    public Bakery (){}
}
