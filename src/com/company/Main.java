package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ListManager listManager = new ListManager(8);
        listManager.addElement(9.1);
        listManager.addElement(6);
        listManager.addElement(-6);
        listManager.addElement(-2);

        listManager.printList();

        System.out.println();
        listManager.sort();
        listManager.printList();

        System.out.println();
        listManager.removeLast();

        System.out.println();
        listManager.printList();
    }
}
