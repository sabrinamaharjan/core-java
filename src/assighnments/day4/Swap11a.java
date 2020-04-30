package assighnments.day4;

import java.util.Scanner;

public class Swap11a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x = scanner.nextInt();
        System.out.println("Enter value of y:");
        int y = scanner.nextInt();

        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("the value of x after swap is : " + x);
        System.out.println("the value of y after swap is : " + y);
    }

}
