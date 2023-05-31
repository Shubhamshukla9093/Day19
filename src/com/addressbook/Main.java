package com.addressbook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        if (name.equalsIgnoreCase("Aaron")) {
            System.out.println("0845 50 50 50");
        } else if (name.equalsIgnoreCase("Fred")) {
            System.out.println("00 49 5000");
        } else if (name.equalsIgnoreCase("Jonas")) {
            System.out.println("666");
        }
    }
}