package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskHelper
{
    Queue<String> myQueue = new LinkedList<>();

    public static void main(String[] args)
    {
        TaskHelper taskHelper = new TaskHelper();
        taskHelper.run();
    }

    public void run()
    {


        Scanner in = new Scanner(System.in);
        String command;
        String commandLine;

        System.out.println("Please enter one of the following commands: ");
        System.out.println("Add <task> to add a task");
        System.out.println("Peek to take a peek at next task");
        System.out.println("HowMany to print remaining list");
        System.out.println("Remove <task> to to complete task the front of the list");
        System.out.println("Flee to skip town and wipe the list of all the things you thought you might do someday");

        do
        {
            System.out.println("What is your command?");
            commandLine = in.nextLine();
            String[] commands = commandLine.split(" ");
            command = commands[0].toUpperCase();
            try
            {
                // could be in method
                if (command.equals("ADD") && commands.length >= 2)
                {
                    for (int i = 0; i < commands.length; i++)
                    {
                        String task = commands[i];
                        addTask(task);

                        if (myQueue.contains("add"))
                        {
                            myQueue.remove();
                        }
                    }
                }
                // redundant after method created
                if (command.equals("PEEK"))
                {
                    System.out.println(myQueue.peek());
                }
                //uses method
                if (command.equals("PEEK") && commands.length == 2)
                {
                    int n = Integer.valueOf(commands[1]);
                    peekTask(n, myQueue);
                }

                if (command.equals("REMOVE") && commands.length == 2)
                {
                    // could be in  method
                    int n = Integer.parseInt(commands[1]);
                    for (int i = 0; i < n - 1; i++)
                    {

                        myQueue.remove(n);
                        System.out.println("Removed " + myQueue.remove());

                    }

                }
                if (command.equals("REMOVE"))
                {
                    removeTask();
                }

                if (command.equals("HOWMANY"))
                {
                    howMany();
                }
            } catch (Exception e)
            {
                System.out.println("Invalid command");
            }
        }

        while (!command.equals("FLEE"));
        {

            flee();
        }
    }

    private void addTask(String task)
    {
        myQueue.add(task);
    }

    private void peekTask(int n, Queue<String> buffer)
    {

        // dirty but works, hardest part of project
        if (myQueue.size() == 1 && n == 0)
            System.out.println("The next item on the list is " + myQueue.peek());

        else if (myQueue.size() == 0)
        {
            System.out.println("List is empty, add items first");
        } else if (myQueue.size() > 1 && n <= myQueue.size())
        {
            buffer = new LinkedList<>();

            for (String task : myQueue)
            {
                buffer.add(task);
            }
            System.out.println("The next " + n + " items on the list ");

            for (int i = 0; i < n; i++)
            {
                System.out.println(buffer.poll());
            }
        } else if (n > myQueue.size())
        {
            System.out.println("Try a lesser number");
        } else
            System.out.println("List is empty");
    }


    private void removeTask()
    {
        System.out.println("Removed " + myQueue.remove());
        System.out.println("Next on list is " + myQueue.peek());
    }

    private void howMany()
    {
        System.out.println(myQueue.size());
    }

    private void flee()
    {
        try
        {
            myQueue.clear();
            System.out.println("List cleared. Bye!");
        } catch (Exception e)
        {
            System.out.println("Invalid command");
        }
    }
}
