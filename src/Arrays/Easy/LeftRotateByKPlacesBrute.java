package Arrays.Easy;

import java.util.Scanner;

public class LeftRotateByKPlacesBrute {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of arrays");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter how many placed you want to rotate");
        int d = sc.nextInt();

        //Store elemnt in temp
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        //Shifting the elements
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        //Put back temp element
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }

        // to print the element
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
