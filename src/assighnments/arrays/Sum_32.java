package assighnments.arrays;

import java.util.Scanner;

public class Sum_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter num: ");
            nums[i] = scanner.nextInt();
        }
        final int result = sumOfArray(nums);
        System.out.println(result);
    }

    static int sumOfArray(int[] arrays) {
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum = sum + arrays[i];
        }
        return sum;
    }
}
