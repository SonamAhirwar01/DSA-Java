package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {2, 5, 10, 8};

        int largest = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] >= largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
