package Patterns;

public class Pattern5 {
    public static void pattern_5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < 5) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern_5(n);

    }
}
