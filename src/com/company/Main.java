package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void LogIn(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hello, please insert your username!");
        String logIn = myObj.nextLine();
        System.out.println("Please insert your password!");
        String password = myObj.nextLine();
        if(Objects.equals(password, "admin")){
            AdminWindow.AdminWindow();
        }  else {
            System.out.println("Password is wrong!");
            LogIn();
        }
        }

    public static void Prisijungti(){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input
        String getName = myObj.nextLine();
        String getSurName = myObj.nextLine();
        int getAge = myObj.nextInt();

        // Output input by user
        System.out.println("Name: " + getName);
        System.out.println("Surname: " + getSurName);
        System.out.println("Age: " + getAge);
    }
    public static void main(String[] args) {
	Users lukas = new Users();
    lukas.setAge(18);
    lukas.setName("Lukas");
    lukas.setSpec("Studentas");
    lukas.setSurName("Karalis");

    LogIn();
    }
}
