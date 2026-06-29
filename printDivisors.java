package Basic_progms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class printDivisors {

    public static List<Integer> getDivisors(int n) {

        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                divisors.add(i);

                // Avoid adding the square root twice
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        // Sort the divisors in ascending order
        Collections.sort(divisors);

        return divisors;
    }

    public static void main(String[] args) {

        int n = 36;

        List<Integer> result = getDivisors(n);

        System.out.println("Divisors of " + n + " are:");

        for (int divisor : result) {
            System.out.print(divisor + " ");
        }
    }
}

// Brute Force Approach
/*
 * method-2
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 * public class printDivisors {
 * 
 * // Function to find all divisors (Brute Force)
 * public static List<Integer> getDivisors(int n) {
 * 
 * List<Integer> divisors = new ArrayList<>();
 * 
 * // Check every number from 1 to n
 * for (int i = 1; i <= n; i++) {
 * 
 * if (n % i == 0) {
 * divisors.add(i);
 * }
 * }
 * 
 * return divisors;
 * }
 * 
 * public static void main(String[] args) {
 * 
 * int n = 36;
 * 
 * List<Integer> result = getDivisors(n);
 * 
 * System.out.println("Divisors of " + n + " are:");
 * 
 * for (int divisor : result) {
 * System.out.print(divisor + " ");
 * }
 * }
 * }
 */

/*
 * method-1
 * public class printDivisors {
 * public static void divisors(int n) {
 * for (int i = 1; i <= n; i++) {
 * if (n % i == 0)
 * System.out.println(i);
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int a = 12;
 * divisors(a);
 * }
 * 
 * }
 */