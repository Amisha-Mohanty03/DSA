package Basic_progms;

public class gcd {
    public static int gcdcalc(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println(gcdcalc(a, b));

    }

}
