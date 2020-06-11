package assighnments.arrays;

import java.util.Scanner;

public class ArraysCollectionsOutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number :");
            nums[i] = scanner.nextInt();
        }

        System.out.println("Select your choices : (arraySum , ascendingOrder, reverse ,findSecondLargest pr findDuplicate  :");
        String choice = scanner.next();
        switch (choice) {
            case "arraySum":
                final int result = ArraysCollections.findSumOfArray(nums);
                System.out.println(result);
            case "ascendingOrder":
                ArraysCollections.getAscendingOrder(nums);
            case "reverse":
                ArraysCollections.getReverse(nums);
            case "findSecondLargest":
                final int secondLargest = ArraysCollections.getLargestSecondLargest(nums);
                System.out.println(secondLargest);
            case "findDuplicate":
                final int duplicate = ArraysCollections.getDuplicateNumbers(nums);
                System.out.println(duplicate);
            default:
                System.out.println("Invalid choice selected: ");
        }
    }
}
