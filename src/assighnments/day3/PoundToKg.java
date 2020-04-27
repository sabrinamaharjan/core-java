package assighnments.day3;

import java.util.Scanner;

public class PoundToKg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pound:");
        double pound = scanner.nextDouble();
        final double result = getPOundTOKg(pound);
        System.out.println(result);
    }

    static double getPOundTOKg(double pound) {
        double kg = pound * 0.454;
        return kg;
    }
}
