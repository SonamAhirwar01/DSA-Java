package Recursion.Functions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

        System.out.println(evenOrOdd(num));
    }

    static boolean evenOrOdd(int num) {
        return (num % 2 == 0);
    }
}
