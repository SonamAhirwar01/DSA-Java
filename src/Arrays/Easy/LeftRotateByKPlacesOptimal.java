package Arrays.Easy;

import java.util.Scanner;

public class LeftRotateByKPlacesOptimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter k places to rotate");
        int k = sc.nextInt();

        //calling rotate function
        rotate(arr, k, n);

        //print values of final rotated array
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }

    //reverse function
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    //Rotate array
    static void rotate(int[] arr, int k, int n) {
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
}
