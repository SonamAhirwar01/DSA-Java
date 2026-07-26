package Conditions;

import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");

        int marks = sc.nextInt();

        if (marks > 90) {
            System.out.println("A");
        } else if (marks >= 75 && marks <= 90) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
