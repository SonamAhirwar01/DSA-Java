package Conditions;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc= new  Scanner (System.in);
        char ch=sc.next().trim().charAt(0);
//        System.out.println(ch);
        if(ch>='a'&& ch<='z' ){
            System.out.println("lowercase");
        }else if (ch>='A'&& ch<'Z'){
            System.out.println("uppercase");
        }else{
            System.out.println("not a case");

        }
    }
}
