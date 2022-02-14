package com.company.linkedlist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node<T> {
    public T data;
    public Node next;
    public Node previous;

    public void displayNode(){
        System.out.println("{ " + data + " }");
    }


}
