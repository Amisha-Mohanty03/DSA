package Basic_progms;

public class primenums {
    public static boolean primeno(int n) {
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                cnt++;
        }
        return cnt == 2;/*
                         * if (cnt == 2)
                         * System.out.println("True");
                         * else
                         * System.out.println("False");
                         */

    }

    public static void main(String[] args) {
        int a = 15;
        System.out.println(primeno(a));
    }
}
