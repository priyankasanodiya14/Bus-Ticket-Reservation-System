package com.Admin;

import java.util.Scanner;

public class adminMenu {


    private static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        while (true) {
            System.out.println("---- ADMIN MENU ----");
            System.out.println("1. Add a new bus");
            System.out.println("2. Edit an existing bus");
            System.out.println("3. Delete a bus");
            System.out.println("4. View all buses");
            System.out.println("5. Logout");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBus();
                    break;
                case 2:
                    editBus();
                    break;
                case 3:
                    deleteBus();
                    break;
                case 4:
                    viewBuses();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void addBus() {
        // Code to add a new bus to the system
    }

    private static void editBus() {
        // Code to edit an existing bus in the system
    }

    private static void deleteBus() {
        // Code to delete a bus from the system
    }

    private static void viewBuses() {
        // Code to display a list of all buses in the system
    }
}
