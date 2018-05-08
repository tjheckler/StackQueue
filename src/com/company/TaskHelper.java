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
                if (command.equals("ADD") && commands.length == 2)
                {
                    String task = commands[1];
                    addTask(task);

                }

                if (command.equals("PEEK"))
                {
                    System.out.println(myQueue.peek());
                }

                if (command.equals("REMOVE"))
                {
                    System.out.println(myQueue.remove());
                    System.out.println(myQueue.peek());
                }
                if (command.equals("HOWMANY"))
                {
                    System.out.println(myQueue.size());
                }
            } catch (Exception e)
            {
                System.out.println("Invalid command");
            }
        }

            while (!command.equals("FLEE")) ;
            {
                try
                {
                    myQueue.clear();
                    System.out.println("List cleared. Bye!");
                }catch (Exception e)
                {
                    System.out.println("Invalid command");
                }

            }
        }



        private void addTask (String task)
        {
            myQueue.add(task);
        }


    }
