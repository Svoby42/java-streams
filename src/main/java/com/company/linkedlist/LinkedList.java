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

    public boolean insertAfter(String key, String data){
        Node node = first;
        while(first.getData() != key){   //looping through all nodes using .next reference
            node = node.getNext();
            if(node == null){
                return false;
            }
        }

        Node toBeCreated = new Node();   //if there is a node with the same data as the key, we continue
        toBeCreated.setData(data);

        if(node == last){               //if the node after which toBeCreated node is going to be inserted is the last node,
            node.setNext(null);         //we have to make sure that the last node points to null
            last = new Node();
        } else {
            toBeCreated.setNext(node.getNext());  //the next node after alois is pepa, the node inserted after alois should point to pepa
            node.getNext().setPrevious(toBeCreated); //the next node after alois is pepa, pepa.previous points to alois, we want pepa to point to our new node
        }

        toBeCreated.setPrevious(node);
        node.setNext(toBeCreated);

        return true;

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
