package com.company;
import java.lang.String;

public class Bookshop extends Shop{
    //public String product[3];

    public static void get_products(){
        //String product[];
        for(int i=0; i <=2; i++){
            String product[ switch (i) {
                default -> throw new IllegalStateException("Unexpected value: " + i);
            }]
            product[i] = "ksiazka";
            System.out.println(product[i]);
        }
    }

    public Bookshop(){}


}
