package Arrays.Basics;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = {5, 8, 7};
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
