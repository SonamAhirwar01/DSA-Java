package Arrays.Basics;

public class Average {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        int average = 0;
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            average = sum / n;
        }
        System.out.println(sum);
        System.out.println(average);
    }
}
