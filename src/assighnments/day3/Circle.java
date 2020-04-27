package assighnments.day3;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();

        final double result = getAreaOfCircle(radius);
        System.out.println(result);
    }

    static double getAreaOfCircle(double radius) {
        final double PI = 3.14;
        double area = PI * radius * radius;
        return area;
    }
}
