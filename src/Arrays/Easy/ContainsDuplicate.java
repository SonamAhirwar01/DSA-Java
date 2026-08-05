package Arrays.Easy;
import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println(containsDuplicateBrute(arr));
        System.out.println(containsDuplicateSort(arr));
        System.out.println(containsDuplicateHashset(arr));
    }

    // Time Complexity: O(n²)
    // Space Complexity: O(1)
    static boolean containsDuplicateBrute(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(1)
    static boolean containsDuplicateSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    static boolean containsDuplicateHashset(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int nums : arr) {
            if (!set.add(nums)) {
                return true;
            }
        }
        return false;
    }
}
