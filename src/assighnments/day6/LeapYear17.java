package assighnments.day6;

import java.util.Scanner;

public class LeapYear17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x:");
        int x = scanner.nextInt();
        final String result = getLeapYear(x);
        System.out.println(result);
    }

    static String getLeapYear(int x) {
        if (x % 4 == 0) {
            return "leapyear";
        }
        return "null";
    }
}
