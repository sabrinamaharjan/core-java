package assighnments.day2;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principle:");
        double principle = scanner.nextDouble();

        System.out.println("Enter Time:");
        double time = scanner.nextDouble();

        System.out.println("Enter Rate:");
        double rate = scanner.nextDouble();

        double simpleInterest = (principle * time * rate) / 100;
        System.out.println("Simple interest is: " + simpleInterest);


    }
}
