package Patterns;

public class Pattern7 {
    public static void pattern7(int number) {

        int patternSize = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= patternSize; j++) {
                System.out.print("* ");

            }
            patternSize++;
            System.out.println("  ");

        }

    }

    public static void main(String[] args) {

        int number = 5;
        pattern7(number);

    }

}
