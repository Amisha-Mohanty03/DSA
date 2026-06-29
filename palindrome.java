package Basic_progms;

public class palindrome {

    public static void palindrome1(int n) {
        int c = n;
        int d = 0;
        while (n > 0) {
            // n = n % 10;
            d = d * 10 + (n % 10);
            n = n / 10;
        }
        if (d == c)
            System.out.println("Palindrome");
        else
            System.out.println("not a palindrome");

    }

    public static void main(String[] args) {
        int a = 1991;
        palindrome1(a);
    }

}
