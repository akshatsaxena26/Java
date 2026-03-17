
package Patterns;

public class Pattern4 {
    public static void pattern_4(int number) {
        if (number % 2 == 0) {
            System.out.println("not possible");
            return;

        }
        int mid = (number / 2) + 1;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || i == number || j == 1 || j == number || i == j || i == mid || j == mid
                        || i + j == number + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int number = 11;
        pattern_4(number);

    }

}
