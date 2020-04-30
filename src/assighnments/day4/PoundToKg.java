package assighnments.day4;

import java.util.Scanner;

public class PoundToKg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pound:");
        double pound = scanner.nextDouble();
        final double result = getPoundToKg(pound);
        System.out.println(result);
    }
    static double getPoundToKg(double pound){
        double kg=0.454*pound;
        return kg;
    }
}


