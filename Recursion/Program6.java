package Recursion;

public class Program6 {

    public static void program6(int n) {

        if (n > 100) {
            return;
        }
        System.out.println(n * n);
        program6(n + 1);

    }

    public static void main(String[] args) {

        int n = 1;

        program6(n);

    }

}