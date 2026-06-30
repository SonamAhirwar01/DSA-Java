package Conditions;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
//        switch (fruit) {
//            case "mango":
//                System.out.println("king of fruit");
//                break;
//            case "orange":
//                System.out.println("round fruit");
//                break;
//            case "apple":
//                System.out.println("Red sweet fruit");
//            case "grapes":
//                System.out.println("small green fruit");
//            default:
//                System.out.println("enter a valid fruit");
//
//
//        }
        int day = sc.nextInt();
//        switch(day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");


//        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");
            case 6, 7 -> System.out.println("weekends");
        }


    }
}
