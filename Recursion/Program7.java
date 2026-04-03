package Recursion;

public class Program7 {

    public static void program7(int n) {

        if (n > 100) {
            return;
        }
        System.out.println(n * n * n);
        program7(n + 1);

    }

    public static void main(String[] args) {

        int n = 1;

        program7(n);

    }

}