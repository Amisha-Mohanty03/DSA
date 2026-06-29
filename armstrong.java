package Basic_progms;

public class armstrong {
    public static void armstrong1(int num) {
        int k = String.valueOf(num).length(); // Get number of digits
        int sum = 0;
        int n = num;

        while (n > 0) {
            int ld = n % 10; // Last digit
            sum += Math.pow(ld, k); // Add ld^k
            n /= 10; // Remove digit
        }

        if (sum == num)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

    }

    public static void main(String[] args) {
        int a = 153;
        armstrong1(a);
    }

}
