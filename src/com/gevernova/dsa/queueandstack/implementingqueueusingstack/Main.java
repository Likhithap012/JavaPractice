package com.gevernova.dsa.queueandstack.implementingqueueusingstack;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(3);
        queue.push(4);
        System.out.println("The element poped is " + queue.pop());
        queue.push(5);
        System.out.println("The top element is " + queue.peek());
        System.out.println("The size of the queue is " + queue.size());
    }
}
