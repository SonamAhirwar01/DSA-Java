package Arrays.Easy;

public class IsSorted {
    public static void main(String[] args) {
        int[] n = {1, 2, 2, 3, 4, 5};
        boolean ans = isSorted(n);
        System.out.println(ans);
    }

    public static boolean isSorted(int n[]) {

        for (int i = 1; i < n.length; i++) {
            if (n[i] >= n[i - 1]) {
            } else {
                return false;
            }
        }
        return true;
    }
}
