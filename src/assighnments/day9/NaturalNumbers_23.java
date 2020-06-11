package assighnments.day9;

import java.util.Scanner;

public class NaturalNumbers_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        NaturalNumbers_23 naturalNumbers_23 = new NaturalNumbers_23();
        final int result = naturalNumbers_23.getNaturalNumberSum(n);
        System.out.println(result);
    }

    public int getNaturalNumberSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
