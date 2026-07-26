package Arrays.Easy;

public class LeftRotateByOne {
    public static void main(String[] args) {

        int[] n = {1, 2, 3, 4, 5, 6, 7};
        int temp = n[0];

        for (int i = 1; i < n.length; i++) {
            n[i - 1] = n[i];
        }

        n[n.length - 1] = temp;

        for (int j : n) {
            System.out.print(j + " ");
        }
    }
}
