package com.company;

import java.util.Scanner;

public class AdminWindow {
    public static void AdminWindow(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("HELLO LUKAS");
        System.out.println("1. Add or delete students groups:");
        System.out.println("2. Add or delete studies:");
        System.out.println("3. Add or delete lectors:");
        System.out.println("4. Add or delete students:");
        System.out.println("5. Add lector to studies:");
        System.out.println("6. Add students to group");
        System.out.println("7. Add studies to group:");
        System.out.println("CHOOSE ONE");
        String ID = myObj.nextLine();
        if (ID.equals("1")) {
            StudentGroups.StudentGroups();
        } else if (ID.equals("2")){
            Studies.Studies();
        } else if (ID.equals("3")){
            Lectors.Lectors();
        } else if (ID.equals("4")){
            Studets.creatingDeleting();
        } else {
            System.out.println("CHOOSE VALID NUMBERS");
            AdminWindow();
        }


    }
}
