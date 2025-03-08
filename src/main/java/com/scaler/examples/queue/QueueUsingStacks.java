package com.scaler.examples.queue;

import java.util.Stack;

public class QueueUsingStacks {


    public Stack<Integer> s1;
    public Stack<Integer> s2;


    public QueueUsingStacks(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }


    // Push element to the back of the queue

    public void push(int x){
        s1.push(x);
    }

    // Removes the element from the front of the queue and returns it

    public int pop(){

        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return s2.pop();

    }

    //// Returns the front element of the queue

    public int peek(){
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    // Returns true if the queue is empty, false otherwise

    public boolean empty(){
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.push(20);
        System.out.println(q.empty());
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.empty());
    }



}
