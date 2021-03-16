package com.company;
import java.lang.String;

import static com.company.Bookshop.get_products;

public class Shop {
    public String adress;
    public String size;

    public Shop(){
        new Bookshop();
        new Bakery();
    }
    public void getInformation(){
        System.out.println(adress);
        System.out.println(size);
        get_products();
        Bakery.get_products();
    }
}
