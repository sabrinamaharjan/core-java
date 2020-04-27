package assighnments.day3;

import java.util.Scanner;

public class FarenheitToCelcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter farenheit:");
        double farenheit = scanner.nextDouble();
        final double result = getFarenheitToCelcius(farenheit);
        System.out.println(result);

    }

    static double getFarenheitToCelcius(double farenheit) {
        double celcius = 5 / 9.0 * (farenheit - 32);
        return celcius;
    }
}
