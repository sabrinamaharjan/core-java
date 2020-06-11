package assighnments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter nums:");
            nums[i] = scanner.nextInt();
        }
        getAscendingOrder(nums);
    }

    static void getAscendingOrder(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
