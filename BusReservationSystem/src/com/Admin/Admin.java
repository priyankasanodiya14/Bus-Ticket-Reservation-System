package com.Admin;

import java.util.Scanner;


public class Admin {
    public static void main(String[] args) {
//        String username = "admin";
//        String password = "admin";
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int attemptCount = 0;

        while (attemptCount < 3) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            try {
                if (inputUsername.equals("admin") && inputPassword.equals("admin")) {
     System.out.println("Login success");
     System.out.println("Welcome to Bus Ticket Reservation System");
//                    System.out.println("Enter the details"); //put all details here what you want to show 
     for(int x=1; x==1;){
     System.out.println("------------------------------------------");
		System.out.println("        ====Admin Menu====  ");
		System.out.println("------------------------------------------");
		System.out.println(" [1] Add                    ");
		System.out.println(" [2] Update                    ");
		System.out.println(" [3] Delete                      ");
		System.out.println(" [4] View                          ");
		System.out.println(" [5] Exit                          ");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------\n");
		
                    break;
                    
     }
                } else {
                    throw new Exception("Invalid credentials. Please try again.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                attemptCount++;
            }
        }

//        if (attemptCount == 3) {
//            System.out.println("Maximum login attempts exceeded. Please try again later.");
//        }
    }
}