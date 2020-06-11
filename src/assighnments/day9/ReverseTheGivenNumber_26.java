package assighnments.day9;

import java.util.Scanner;

public class ReverseTheGivenNumber_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        ReverseTheGivenNumber_26 obj = new ReverseTheGivenNumber_26();
        final int result = obj.getReverseNumber(n);
        System.out.println(result);
    }

    public int getReverseNumber(int n ) {
        int reverse = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        return reverse;
    }
}
