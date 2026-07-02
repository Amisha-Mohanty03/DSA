package Arrays;

public class removeDuplicates {
    public static int duplicateremove(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n;
        }
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] a = { 12, 12, 13, 13, 11, 3, 3, 3, 3, 4, 5, 6 };
        System.out.println(duplicateremove(a));

    }

}
