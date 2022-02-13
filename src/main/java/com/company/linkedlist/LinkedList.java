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

    public void deleteFirst(){
        if(first.next == null){
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
    }

    public void deleteLast(){
        if(first.next == null){
            first = null;
        }
        else {
            last.previous.next = null;
        }
        last = last.previous;
    }

    public void displayData(){
        Node node = first;
        while(node != null){
            node.displayNode();
            node = node.next;
        }
        System.out.println("----------");
    }

    public void firstAndLastInfo(){
        System.out.println("-----------");
        System.out.println("první: " + getFirst().getData());
        System.out.println("před prvním: (previous) " + getFirst().getPrevious());
        System.out.println("za prvním: (next) " + getFirst().getNext().getData());
        System.out.println("-----------");
        System.out.println("poslední: " + getLast().getData());
        System.out.println("před posledním: (previous) " + getLast().getPrevious().getData());
        System.out.println("za posledním: (next) " + getLast().getNext());
        System.out.println("-----------");
    }


}
