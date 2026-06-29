package Arrays;

//Optimal Approach
public class largestElement {
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a = { 12, 3, 4, 5, 6 };
        System.out.println(largest(a));

    }

}

/*
 * Brute Force Approach
 * import java.util.Arrays;
 * public class largestElement {
 * public static int largest(int[] arr) {
 * Arrays.sort(arr);
 * 
 * return arr[arr.length - 1];
 * }
 * 
 * public static void main(String[] args) {
 * int[] a = { 12, 3, 4, 5, 6 };
 * System.out.println(largest(a));
 * 
 * }
 * 
 * }
 */