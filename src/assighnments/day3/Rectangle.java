package assighnments.day3;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length :");
        double length = scanner.nextDouble();
        System.out.println("Enter breath:");
        double breath = scanner.nextDouble();

        final double result = getAreaOfRectangle(length,breath);
        System.out.println(result);

    }
    static double getAreaOfRectangle(double length,double breath){
        double area=length * breath;
        return area;
    }
}
