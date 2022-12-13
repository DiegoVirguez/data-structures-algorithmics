package com.diego.dataStructures.stacksAndQueues;

public class Stack {
    private static class Node{
        private int data;
        private Node next;
        private Node(int data){
            this.data = data;
        }
    }

    private Node top;

    private boolean isEmpty(){
        return top == null;
    }
    private int peek(){
        return top.data;
    }
    public void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    }
    public int pop(){
        int data = top.data;
        top = top.next;
        return data;
    }
}
