package assighnments.day6;

import java.util.Scanner;

public class EvenOrOdd_16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        final String result = getEvenOrOdd(x);
        System.out.println(result);
    }

    static String getEvenOrOdd(int x) {
        if (x % 2 == 0) {
            return "Even";
        }else{
            return "Odd";
        }
    }
}
