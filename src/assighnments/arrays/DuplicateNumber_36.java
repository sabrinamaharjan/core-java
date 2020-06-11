package assighnments.arrays;

import java.util.Scanner;

public class DuplicateNumber_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter nums:");
            nums[i] = scanner.nextInt();
        }
        final int result = getDuplicateNumbers(nums);
        System.out.println(result);
    }
    static int getDuplicateNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }
}
