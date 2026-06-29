package Basic_progms;

public class reverseAnNumber {
    public static int reverseDigit(int n) {
        int d = 0;
        while (n > 0) {
            // n = n % 10;
            d = d * 10 + (n % 10);
            n = n / 10;
        }
        return d;

    }

    public static void main(String[] args) {
        int a = 199;
        System.out.println(reverseDigit(a));
    }

}
