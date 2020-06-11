package assighnments.day9;

import java.util.Scanner;

public class Day9Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice from: (factorial, naturalNumber, reverse , table ,fibonacci ,prime or pattern):");
        String choice = scanner.next();

        switch (choice) {
            case "factorial":
                System.out.println("Enter value of n:");
                int n = scanner.nextInt();
                Day9 factorial = new Day9();
                int result = factorial.getFactorialNumber(n);
                System.out.println(result);
                break;
            case "naturalNumber":
                System.out.println("Enter n:");
                n = scanner.nextInt();
                Day9 naturalNum = new Day9();
                result = naturalNum.getNaturalNumberSum(n);
                System.out.println(result);
                break;
            case "reverse":
                System.out.println("Enter the value of n:");
                n = scanner.nextInt();
                Day9 reverse = new Day9();
                result = reverse.getReverseNumber(n);
                System.out.println(result);
                break;
            case "table":
                System.out.println("Enter n:");
                n = scanner.nextInt();
                Day9 table = new Day9();
                table.getPrintTable(n);
                break;
            case "fibonacci":
                System.out.println("Enter n:");
                n = scanner.nextInt();
                Day9 fibonacci = new Day9();
                fibonacci.getFabonaci(n);
                break;
            case "prime":
                System.out.println("Enter n:");
                n = scanner.nextInt();
                Day9 prime = new Day9();
                prime.checkPrime(n);
                break;
            case "pattern":
                System.out.println("Enter n:");
                n = scanner.nextInt();
                Day9 pattern = new Day9();
                pattern.printPattern(n);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
