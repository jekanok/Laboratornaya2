package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ListManager listManager = new ListManager(8);
        listManager.addElement(5);
        listManager.addElement(6);
        listManager.addElement(-6.3);
        listManager.addElement(-2);

        listManager.printList();
        System.out.println();
        listManager.sort();
        listManager.printList();

//        Scanner in = new Scanner(System.in);
//        String choise = "";
//
//        while (!(choise.equals("y")))
//        {
//            System.out.println();
//
//            System.out.println("- MENU -");
//            System.out.println("1: Add new");
//            System.out.println("2: Delete last");
//            System.out.println("3: Sort");
//            System.out.println("4: Print list");
//            System.out.println("\n5: Exit.\n");
//
//            System.out.print("Enter your variant: ");
//            choise = in.nextLine().toLowerCase();
//
//            switch (choise) {
//                case "1" : {
//                    System.out.print("Enter new element: ");
//                    String line = in.nextLine();
//                    list.addElement(Double.parseDouble(line));
//
//                    break;
//                }
//                case "2" : {
//                    list.removeLast();
//                    break;
//                }
//                case "3" : {
//                    list.sorted();
//                    break;
//                }
//                case "4" : {
//                    list.printList();
//                    break;
//                }
//                case "5" : {
//                    choise = "y";
//
//                    break;
//                }
//
//                default: break;
//            }
//        }
    }
}
