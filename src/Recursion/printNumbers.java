package Recursion;

public class printNumbers {
    public static void main(String[] args) {
        printnums(1);
    }
    static void printnums(int n) {
        if(n==10){
            System.out.println(10);
            return;
        }
        System.out.println(n);
        printnums(n+1);
    }

}
