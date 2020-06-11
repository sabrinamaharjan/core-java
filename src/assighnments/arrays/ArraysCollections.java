package assighnments.arrays;

import java.util.Arrays;

public class ArraysCollections {

    static void getAscendingOrder(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
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

    static void getReverse(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
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

    static int findSumOfArray(int[] arrays) {
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum = sum + arrays[i];
        }
        return sum;
    }

}
