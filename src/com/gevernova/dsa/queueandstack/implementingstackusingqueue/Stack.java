package com.gevernova.dsa.queueandstack.implementingstackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    Queue<Integer>q=new LinkedList<>();
    void push(int data){
        int size=q.size();
        q.add(data);
        for(int i=0;i<size-1;i++){
            q.add(q.remove());
        }
    }
    int pop(){
        return q.remove();
    }
    int top(){
        return q.peek();
    }
    int size(){
        return q.size();
    }

}
