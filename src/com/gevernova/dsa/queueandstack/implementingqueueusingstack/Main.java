package com.gevernova.dsa.queueandstack.implementingqueueusingstack;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}
