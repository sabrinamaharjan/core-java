package assighnments.day6;

import java.util.Scanner;

public class TwoInteger_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();
        getIntegers(x, y);
    }

    static void getIntegers(int x, int y) {
        if (x == y) {
            System.out.println("x and y are equal");
        } else if (x > y) {
            System.out.println("x is greater than y");
        } else if (x < y) {
            System.out.println("y is greater than x");
        }
    }
}
