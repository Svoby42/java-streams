package com.company.linkedlist;

public class App {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst("lojza");
        list.insertFirst("pepa");
        list.insertFirst("alois");
        list.insertFirst("baloun");

        list.displayData();

        list.firstAndLastInfo();
    }

}
