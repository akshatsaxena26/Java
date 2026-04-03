package Recursion;

public class Program5 {

    public static int program5(int n, int count) {

        if (n > 100) {
            return count;
        }
        return program5(n + 1, count += n);

    }

    public static void main(String[] args) {
        int count = 0;
        int n = 1;
        int result = program5(n, count);
        System.out.println(result);
    }

}
