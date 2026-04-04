package Recursion;

public class Program8 {

    public static int program8(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * program8(n - 1);

    }

    public static void main(String[] args) {

        int n = 5;

        int result = program8(n);
        System.out.println(result);

    }

}
