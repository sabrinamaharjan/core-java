package assighnments.arrays;

import java.util.Scanner;

public class SecondLargestNumber_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter nums:");
            nums[i] = scanner.nextInt();
        }
        final int result = getLargestSecondLargest(nums);
        System.out.println(result);
    }
    static int getLargestSecondLargest(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        return secondMax;
    }
}
