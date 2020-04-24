package assighnments.day2;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of x");
        int x =scanner.nextInt();
        System.out.println("Enter value of y");
        int y = scanner.nextInt();

        int sum = x+y;
        System.out.println("sum of x and y is: " + sum);

        int average = (x+y)/2;
        System.out.println("average of x and y is: " + average);
    }
}
