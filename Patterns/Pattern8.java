package Patterns;

public class Pattern8 {
    public static void pattern8(int number) {

        int patternSize = number;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= patternSize; j++) {
                System.out.print("* ");

            }
            patternSize--;
            System.out.println("  ");

        }

    }

    public static void main(String[] args) {

        int number = 5;
        pattern8(number);

    }

}
