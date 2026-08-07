package Arrays.Arrays2D;

import java.util.*;

public class DiagonalElementSum {
    public static void main(String[] args) {

        int sum = 0;

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        //Input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //sum of diagonal element
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][i];
        }

        System.out.println(sum);
    }
}
