package Arrays;

import java.util.Arrays;

public class SecondLargest {
    // Brute Force Approach
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);

        return arr[arr.length - 2];
    }

    /*
     * Optimal Approach
     * public static int secondLargest(int[] arr) {
     * 
     * int largest = Integer.MIN_VALUE;
     * int secondLargest = Integer.MIN_VALUE;
     * 
     * for (int i = 0; i < arr.length; i++) {
     * 
     * if (arr[i] > largest) {
     * secondLargest = largest;
     * largest = arr[i];
     * } else if (arr[i] > secondLargest && arr[i] != largest) {
     * secondLargest = arr[i];
     * }
     * }
     * 
     * return secondLargest;
     */

    public static void main(String[] args) {
        int[] a = { 12, 3, 4, 5, 6 };
        System.out.println(secondLargest(a));

    }
}