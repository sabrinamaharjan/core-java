package assighnments.day4;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scanner.nextInt();
        getNegativeNumber(x);
    }
    static void getNegativeNumber(int x) {
        if (x <= 0) {
            System.out.println(x);
        }
    }
}
