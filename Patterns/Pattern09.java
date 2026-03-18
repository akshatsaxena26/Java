package Patterns;

public class Pattern09 {
    public static void pattern9(int number) {

        int patternSize = 5;
        int spaceSize = 0;
        for (int i = 1; i <= number; i++) {

            for (int k = 1; k <= spaceSize; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= patternSize; j++) {
                System.out.print("* ");

            }

            patternSize--;
            spaceSize++;
            System.out.println("");

        }

    }

    public static void main(String[] args) {

        int number = 7;
        pattern9(number);

    }

}
