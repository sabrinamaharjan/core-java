package assighnments.day6;

import java.util.Scanner;

public class LargestValue_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of x:");
        int x = scanner.nextInt();
        System.out.println("enter value of y:");
        int y = scanner.nextInt();
        System.out.println("enter value of z:");
        int z = scanner.nextInt();
        final int result = getLargestNumber(x, y, z);
        System.out.println("The largest value is  : " + result);
    }

    static int getLargestNumber(int x, int y, int z) {
        if (x > y) {
            if (x > z) {
                return x;
            } else {
                return z;
            }
        } else {
            if (y > z) {
                return y;
            } else {
                return z;
            }
        }

    }
}
