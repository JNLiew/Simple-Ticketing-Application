package com.example.ticketing.backend;

import java.util.LinkedList;

public class fifoqueue implements IQueuable {
    private LinkedList<Integer> queue;

    // Initiating linked-list
    fifoqueue() {
        queue = new LinkedList<>();
    }

    //public String[] enqueue(String value) {
    public void enqueue(int value) {
        // Adding it to the tail of the queue
        queue.addLast(value);
    }

    public Integer dequeue() {
        // If queue is empty, throw exception
        if (queue.isEmpty()){
            return -1;
        }
        // Removing the head of the queue
        return queue.removeFirst();
    }

    public String[] getQueue() {
        // Converting linked-list to array
        String[] arr = new String[queue.size()];
        return queue.toArray(arr);
    }

    public int size() {
        return queue.size();
    }
}