package assighnments.day4;

import java.util.Scanner;

public class MathematicalFunction10b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a:");
        double a = scanner.nextDouble();
        System.out.println("enter b; ");
        double b = scanner.nextDouble();
        System.out.println("enter c");
        double c = scanner.nextDouble();

        final double result = getArae(a, b, c);
        System.out.println(result);
    }
    static double getArae(double a,double b,double c){
        double s = (a+b+c)/2;
        double area =Math.sqrt(s * (s-a) * (s-b) * (s-c));
        return area;
    }
}
