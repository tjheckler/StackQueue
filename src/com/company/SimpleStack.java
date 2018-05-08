package com.company;

import java.util.Stack;

public class SimpleStack
{
    public static void main(String[] args)
    {
        SimpleStack simpleStack = new SimpleStack();
        simpleStack.run();
    }
    private void run()
    {
        Stack<String> myStack = new Stack<>();

        myStack.push("one");
        myStack.push("two");
        myStack.push("three");
        myStack.push("four");
        myStack.push("five");

        System.out.println(myStack);
       // System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack);
        //System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack);
       // System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack);
        //System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack);
        //System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack);
        //System.out.println(myStack.pop());
        System.out.println(myStack.peek());


    }
}
