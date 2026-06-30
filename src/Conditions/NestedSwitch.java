package Conditions;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int empId= sc.nextInt();
        String departmentId= sc.next();

        switch(empId){
            case 1-> System.out.println("A");
            case 2-> System.out.println("B");
            case 3-> System.out.println("C");
            case 4-> System.out.println("D");
            case 5-> {
                switch(departmentId){
                    case "IT" -> System.out.println("it department");
                    case "Management" -> System.out.println("it department");
                }
            }
            default -> System.out.println("enter correct empid");

        }

    }
}
