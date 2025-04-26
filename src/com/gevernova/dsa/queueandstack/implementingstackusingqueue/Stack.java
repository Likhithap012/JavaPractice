package com.gevernova.dsa.queueandstack.implementingstackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    Queue<Integer> queue =new LinkedList<>();
    void push(int data){
        int size= queue.size();
        queue.add(data);
        for(int i=0;i<size-1;i++){
            queue.add(queue.remove());
        }
    }
    int pop(){
        return queue.remove();
    }
    int top(){
        return queue.peek();
    }
    int size(){
        return queue.size();
    }

}
