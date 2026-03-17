/*
***********
*         *
*         *
*         *
***********
*/

package Patterns;

public class Pattern3 {
    public static void pattern_3(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || i == number || j == 1 || j == number) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int number = 5;
        pattern_3(number);

    }

}
