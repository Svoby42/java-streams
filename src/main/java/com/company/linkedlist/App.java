package com.company.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.insertFirst("lojza");
        list.insertFirst("pepa");
        list.insertFirst("alois");
        list.insertFirst("baloun");

        list.displayData();
        list.firstAndLastInfo();


    }

}
