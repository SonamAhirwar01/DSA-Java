package Leetcode;

public class FizzBuzz {
    public static boolean main(String[] args) {
        int x = 121;
        int rev = 0;
        while (x > 0) {
            int LD = x % 10;
            rev = rev * 10 + LD;
            x = x / 10;
        }
        if (x == rev) {
            return true;
        } else {
            return false;
        }


    }

    public static boolean isPalindrome(int x) {
        int rev = 0;
        while (x > 0) {
            int LD = x % 10;
            rev = rev * 10 + LD;
            x = x / 10;
        }
        if (x == rev) {
            return true;
        } else {
            return false;
        }

    }

}
