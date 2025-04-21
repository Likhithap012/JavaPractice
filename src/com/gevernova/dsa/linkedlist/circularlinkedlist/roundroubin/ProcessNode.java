package com.gevernova.dsa.linkedlist.circularlinkedlist.roundroubin;

public class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    ProcessNode next;

    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime; // initially remaining time is the same as burst time
        this.priority = priority;
        this.next = null;
    }
}

