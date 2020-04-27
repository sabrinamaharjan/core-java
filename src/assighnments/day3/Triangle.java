package assighnments.day3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base:");
        double base = scanner.nextDouble();
        System.out.println("Enter height:");
        double height = scanner.nextDouble();

        final double result = getAreaOfTriangle(height , base);
        System.out.println("Area of Triangle is: " + result);


    }
    static double getAreaOfTriangle(double base,double height){
        double area = (base * height)/2;
        return area;
    }
}
