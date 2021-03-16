package com.company;

import java.lang.String;

public class Main {

    public static void main(String[] args){
        Shop ksiegarnia = new Bakery();
        Shop piekarnia = new Bookshop();
        ksiegarnia.getInformation();
        piekarnia.getInformation();
    }
}
