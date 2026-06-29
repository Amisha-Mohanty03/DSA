package Basic_progms;

class countAllDigits {
    public static int countDigit(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n = n / 10;
        }
        return c;

    }

    public static void main(String[] args) {
        int a = 199;
        System.out.println(countDigit(a));
    }
}