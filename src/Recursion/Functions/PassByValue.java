package Recursion.Functions;

public class PassByValue {
    public static void main(String[] args) {
        int num = 5;

        change(num);

        System.out.println(num);
    }

    static void change(int nums) {
        nums = 10;
    }
}
