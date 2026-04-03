package Recursion;

public class Program4 {
    public static void program4(int n, int i) {
        if (i > 10) {
            return;

        }
        // Print current step
        System.out.println(n + " x " + i + " = " + (n * i));

        program4(n * 1, i + 1);
    }

    public static void main(String[] args) {
        int n = 3;

        program4(n, 1);

    }

}
