package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Input values for first class");
        ISaveable unit1 = new Player("Adrian");
        unit1.populateFields(readValues());

        System.out.println("Input values for second class");
        ISaveable unit2 = new Monster("Trundle");
        unit2.populateFields(readValues());

        System.out.println("=== Inputting values has been finished ===\n");

        System.out.println(unit1.toString());
        System.out.println(unit2.toString());

    }



    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}