package assighnments.day7;

import java.util.Scanner;

public class FourFunctionCalculator_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();
        System.out.println("Enter choice among (+ , - , * or / ):");
        char operator = scanner.next().charAt(0);
        getCalculator(x, y, operator);
    }

    static void getCalculator(int x, int y, char operator) {
        switch (operator) {
            case '+':
                int sum = x + y;
                System.out.println(sum);

                break;
            case '-':
                int subtraction = x - y;
                System.out.println(subtraction);

                break;
            case '*':
                int multiply = x * y;
                System.out.println(multiply);

                break;
            case '/':
                int divide = x * y;
                System.out.println(divide);

                break;
            default:
                System.out.println("wrong input");

                break;
        }
        System.out.println("exit");
    }
}
