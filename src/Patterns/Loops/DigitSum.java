package Patterns.Loops;

public class DigitSum {
    public static void main(String[] args) {
        int n = 1515;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        System.out.println(sum);
    }
}
