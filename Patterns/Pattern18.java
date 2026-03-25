package Patterns;

public class Pattern18 {

    public static void pattern18(int n) {
        int patternSize = n;
        int space = 0;
        int rowMid = (n / 2) + 1;

        for (int i = 1; i <= n; i++) {
            int num = 1;
            int colMid = (patternSize / 2) + 1;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= patternSize; k++) {
                if (k < colMid) {
                    System.out.print(num++ + " ");
                } else {
                    System.out.print(num-- + " ");
                }
            }
            if (i < rowMid) {
                patternSize -= 2;
                space += 1;

            } else {
                patternSize += 2;
                space -= 1;

            }

            System.out.println(" ");

        }

    }

    public static void main(String[] args) {
        int n = 3;
        pattern18(n);

    }
}