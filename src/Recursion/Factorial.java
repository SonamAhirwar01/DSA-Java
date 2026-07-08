package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(6));
    }
    static int fact(int n) {
        int fact = 1;
        if (n == 0 || n == 1) {
            return 1;
        }
        fact = fact * n;
        return n * fact(n - 1);
    }
}
