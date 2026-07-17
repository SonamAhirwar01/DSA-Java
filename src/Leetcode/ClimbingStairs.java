package Leetcode;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbingStairs(5));
    }

    public static int climbingStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbingStairs(n - 1) + climbingStairs(n - 2);
    }
}
