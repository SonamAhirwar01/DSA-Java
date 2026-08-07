package Arrays.Arrays2D;

import java.util.*;

public class SumOf2DArray {
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter you elements");

        int[][] arr = new int[2][2];

        //input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        //sum
        for (int[] a : arr) {
            for (int b : a) {
                sum = sum + b;
            }
        }

        //print sum
        System.out.println(sum);
    }
}
