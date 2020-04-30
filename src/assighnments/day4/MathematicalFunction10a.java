package assighnments.day4;

import java.util.Scanner;

public class MathematicalFunction10a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter velocity:");
        double velocity = scanner.nextDouble();
        System.out.println("Enter time:");
        double time = scanner.nextDouble();
        System.out.println("Enter acceleration:");
        double acceleration = scanner.nextDouble();

        final double result = getDistance(velocity, time, acceleration);
        System.out.println(result);
    }

    static double getDistance(double velocity, double time, double acceleration) {
        double distance = (velocity * time) + (1 / 2 * (acceleration * time * time));
        return distance;
    }
}
