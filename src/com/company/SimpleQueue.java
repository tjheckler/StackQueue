package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue
{
    public static void main(String[] args)
    {
        SimpleQueue simpleQueue = new SimpleQueue();
        simpleQueue.run();
    }
    private void run()
    {
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("one");
        myQueue.add("two");
        myQueue.add("three");
        myQueue.add("four");
        myQueue.add("five");
        System.out.println(myQueue);
       // System.out.println(myQueue.remove());
       // System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
        System.out.println(myQueue);

        //System.out.println(myQueue.remove());
       // System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
        System.out.println(myQueue);
       //System.out.println(myQueue.remove());
        //System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
        System.out.println(myQueue);
        //System.out.println(myQueue.remove());
       //System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
        System.out.println(myQueue);
        //System.out.println(myQueue.remove());
        //System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
        System.out.println(myQueue);
        //System.out.println(myQueue.remove());
        //System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());

    }
}
