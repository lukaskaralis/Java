package com.company;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Studets {
    String name;
    int age;

    private static void delete() {
        System.out.println("How many students you will add?");


    }
    public static void add() {
        int lenght;
        Scanner input = new Scanner(System.in);
        System.out.println("How many students you will add?");
        lenght = input.nextInt();

        String[] names = new String[lenght];
        String[] surName = new String[lenght];

        for(int counter = 0; counter < lenght; counter++){
            System.out.println("Enter the student name and surName "+(counter+1)+":");
                names[counter] = input.next();
                surName[counter] = input.next();
        }
        input.close();
        System.out.println("Added students are:");
        for(int counter = 0; counter < lenght; counter++){
            System.out.println(names[counter]+" "+surName[counter]);
        }
        System.out.println("End");
        delete();
    }

    protected static void creatingDeleting() {
        Scanner myObjs = new Scanner(System.in);
        System.out.println("0. Go back:");
        System.out.println("1. Add student:");
        System.out.println("2. Delete student:");
        String IDs = myObjs.nextLine();
        if (IDs.equals("1")) {
            add();
        } else if (IDs.equals("2")) {
            delete();
        } else if (IDs.equals("0")) {
            AdminWindow.AdminWindow();
        } else {
            System.out.println("CHOOSE VALID NUMBERS");
            creatingDeleting();
        }

    }
}