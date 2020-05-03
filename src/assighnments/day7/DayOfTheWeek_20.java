package assighnments.day7;

import java.util.Scanner;

public class DayOfTheWeek_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number between 1 to 7:");
        int x = scanner.nextInt();
        getDayOfWeek(x);
    }

    static void getDayOfWeek(int x) {
        switch (x) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesdat");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input ");
                break;
        }
        System.out.println("Exit");
    }
}
