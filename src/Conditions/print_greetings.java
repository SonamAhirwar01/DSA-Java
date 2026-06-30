package Conditions;

import java.util.Scanner;

public class print_greetings {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name");
        String name= sc.next();
        System.out.println("hello " +name);
    }

}
