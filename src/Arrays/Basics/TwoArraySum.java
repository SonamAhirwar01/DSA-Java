package Arrays.Basics;

import java.util.Arrays;

public class TwoArraySum {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        int[] result = elementWiseSum(arr1, arr2);
        System.out.println(Arrays.toString(result));

    }

    static int[] elementWiseSum(int[] arr1, int[] arr2) {
        int[] sum = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            sum[i] = arr1[i] + arr2[i];
        }
        return sum;
    }
}
