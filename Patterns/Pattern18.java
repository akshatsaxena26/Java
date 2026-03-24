package Patterns;

public class Pattern18 {
    public static void pattern18(int number) {
        int spaces = number - 1;
        int patternSize = 1;

        for (int i = 1; i <= number; i++) {
            int num = 1;

            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");

            }
            int colMid = (patternSize / 2) + 1;
            for (int k = 1; k <= patternSize; k++) {
                if (k < colMid) {
                    System.out.print(num++ + " ");

                } else {
                    System.out.print(num-- + " ");
                }

            }
            patternSize += 2;
            spaces -= 1;

            System.out.println("");
        }

    }

    // This pattern is not completed

    public static void main(String[] args) {

        int number = 5;
        pattern18(number);

    }
}