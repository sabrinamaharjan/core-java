package assighnments.arrays;

import java.util.Scanner;

public class RevrseArray_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]nums = new int[6];
        for (int i = 0; i <6 ; i++) {
            System.out.println("Enter num:");
            nums[i] = scanner.nextInt();
        }

        getReverse(nums);
    }
    static void getReverse(int [] nums){
        for (int i = nums.length-1; i >=0; i--) {
            System.out.println(nums[i]);
        }
    }
}
