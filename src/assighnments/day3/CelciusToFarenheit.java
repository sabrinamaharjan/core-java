package assighnments.day3;

import java.util.Scanner;

public class CelciusToFarenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter celcius:");
        double celcius = scanner.nextDouble();
        final double result = getCelciusToFarenheit(celcius);
        System.out.println(result);
    }

    static double getCelciusToFarenheit(double celcius) {
        double farenheit = (9 / 5 * celcius) + 32;
        return farenheit;
    }
}
