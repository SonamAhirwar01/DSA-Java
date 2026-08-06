package Recursion.Functions;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 5, 8, 6, 9, 1};
        int result = maxValue(arr);
        System.out.println(result);
    }

    static int maxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
