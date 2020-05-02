package assighnments.day6;

import java.util.Scanner;

public class Triangle_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a:");
        int a = scanner.nextInt();
        System.out.println("Enter side b:");
        int b = scanner.nextInt();
        System.out.println("Enter side c:");
        int c = scanner.nextInt();
        getSidesOfTRiangle(a, b, c);
    }

    static void getSidesOfTRiangle(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || c == a) {
            System.out.println("isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
