package com.gevernova.collections.queue.mystack;

class StackUsingQueues {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Pop: " + s.pop()); // Output: 3
    }
}
