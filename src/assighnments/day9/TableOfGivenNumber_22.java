package assighnments.day9;

import java.util.Scanner;

public class TableOfGivenNumber_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        TableOfGivenNumber_22 tableOfGivenNumber_22 = new TableOfGivenNumber_22();
        tableOfGivenNumber_22.getPrintTable(n);
    }

    public void getPrintTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }
}
