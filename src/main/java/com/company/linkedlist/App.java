package com.company.linkedlist;

public class App {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst("lojza");
        list.insertFirst("pepa");
        list.insertFirst("alois");
        list.insertFirst("baloun");
        list.displayData();

        System.out.println("první: " + list.getFirst().data);
        System.out.println("před prvním: " + list.getFirst().previous);
        System.out.println("za prvním: " + list.getFirst().next.data);



    }

}
