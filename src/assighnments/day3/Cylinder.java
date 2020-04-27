package assighnments.day3;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();
        System.out.println("Enter length:");
        double length = scanner.nextDouble();

        final double result = getVolumeOfCylinder(radius, length);
        System.out.println("The volume of cylinder is: " + result);
    }

    static double getVolumeOfCylinder(double radius, double length) {
        final double PI = 3.14;
        double volume = PI * radius * radius * length;
        return volume;
    }
}
