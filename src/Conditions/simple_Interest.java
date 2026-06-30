package Conditions;

import java.util.Scanner;

public class simple_Interest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount");
        int principal = sc.nextInt();

        System.out.println("Enter time");
        int time = sc.nextInt();

        System.out.println("Enter rate of interest");
        int rate = sc.nextInt();

        int simpleInterest = ((principal * rate * time) / 100);

        System.out.println("your simple interest is " + simpleInterest);
    }
}
