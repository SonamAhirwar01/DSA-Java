package Conditions;

import java.util.Scanner;

public class TriangleInequality {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();

        System.out.println("enter b");
        int b = sc.nextInt();

        System.out.println("enter c");
        int c = sc.nextInt();

        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            System.out.println("Triangle can be formed");
        } else {
            System.out.println("Triangle cannot be formed");
        }
    }
}
