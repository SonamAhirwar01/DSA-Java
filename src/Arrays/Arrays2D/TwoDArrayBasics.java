package Arrays.Arrays2D;

import java.util.*;

public class TwoDArrayBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][2];

        //input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        change(arr);

        //print
        for (int[] arr1 : arr) {
            System.out.println(Arrays.toString(arr1));
        }
    }

    static void change(int[][] arr) {
        arr[1][1] = 100;
    }
}
