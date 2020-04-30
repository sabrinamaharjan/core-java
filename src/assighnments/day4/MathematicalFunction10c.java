package assighnments.day4;

import java.util.Scanner;

public class MathematicalFunction10c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a:");
        double a = scanner.nextDouble();
        System.out.println("enter b; ");
        double b = scanner.nextDouble();
        System.out.println("enter c");
        double c = scanner.nextDouble();

        final double result = getX(a, b, c);
        System.out.println(result);
    }

    static double getX(double a, double b, double c) {
        double x = (-b + Math.sqrt(b * b - (4 * a * c))) / 2 * a;
        return x;
    }
}
