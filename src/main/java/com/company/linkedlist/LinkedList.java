package com.company.linkedlist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LinkedList {

    private Node first;
    private Node last;

    public LinkedList(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(String data) {
        Node node = new Node();
        node.data = data;

        if(isEmpty()){
            last = node;
        } else{
            first.previous = node;
        }

        node.next = first;
        this.first = node;

    }

    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null){
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public void displayData(){
        Node node = first;
        while(node != null){
            node.displayNode();
            node = node.next;
        }
        System.out.println();
    }


}
