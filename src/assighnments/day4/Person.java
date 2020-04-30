package assighnments.day4;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter roll:");
        int roll = scanner.nextInt();
        System.out.println("Enter nationality:");
        String nationality = scanner.next();
        getPersonInf(name, roll, nationality);
    }

    static void getPersonInf(String name, int roll, String nationality) {
        System.out.println("My name is " + name + " of roll number  " + roll + " and my Nationality  is . " + nationality);
    }
}
