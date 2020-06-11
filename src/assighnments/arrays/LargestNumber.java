package assighnments.arrays;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter nums:");
            nums[i] = scanner.nextInt();
        }
        final int result = getLargestNumber(nums);
        System.out.println(result);
    }

    static int getLargestNumber(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
