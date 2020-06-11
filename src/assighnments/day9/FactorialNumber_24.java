package assighnments.day9;

import java.util.Scanner;

public class FactorialNumber_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = scanner.nextInt();
        FactorialNumber_24 factorialNumber_24 = new FactorialNumber_24();
        final int result = factorialNumber_24.getFactorialNumber(n);
        System.out.println(result);
    }

    public int getFactorialNumber(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getFactorialNumber(n - 1);
        }
    }
}
