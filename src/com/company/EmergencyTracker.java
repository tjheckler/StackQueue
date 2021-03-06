package com.company;

import java.util.Scanner;
import java.util.Stack;

public class EmergencyTracker
{
    Stack<String> myStack = new Stack<>();

    public static void main(String[] args)
    {
        EmergencyTracker emergencyTracker = new EmergencyTracker();
        emergencyTracker.run();
    }

    public void run()
    {


        Scanner in = new Scanner(System.in);
        String command;
        String commandLine;

        System.out.println("Please enter one of the following commands: ");
        System.out.println("Add <Emergency Name> to add emergency");
        System.out.println("Peek to print out next emergency");
        System.out.println("HowMany to print how many remaining emergencies");
        System.out.println("Remove <task> to to complete task the front of the list");
        System.out.println("Panic to skip town and wipe the list of emergencies");

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
                    String emergency = commands[1];

                    addEmergency(emergency);

                }

                if (command.equals("PEEK"))
                {

                    peekEmergency();
                }

                if (command.equals("REMOVE"))
                {

                    removeEmergency();

                }
                if (command.equals("HOWMANY"))
                {

                    showHowMany();

                }
            } catch (Exception e)
            {
                System.out.println("Invalid command");
            }
        }
        while (!command.equals("PANIC"));
        {
            flee();
        }

    }

    private void addEmergency(String emergency)
    {

        myStack.add(emergency);


    }

    private void peekEmergency()
    {
        System.out.println(myStack.peek());
    }

    private void removeEmergency()
    {
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }

    public void showHowMany()
    {
        System.out.println(myStack.size());
    }
    private void flee()
    {
        myStack.clear();
        System.out.println("Time to skip town");
    }
}

