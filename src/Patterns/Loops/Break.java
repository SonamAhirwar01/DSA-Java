package Patterns.Loops;

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i < 30; i++) {
            if (i == 15) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
