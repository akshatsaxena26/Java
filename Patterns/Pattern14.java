package Patterns;

public class Pattern14 {
    public static void pattern14(int number) {

        int patternSize = 1;
        int num = 1;

        for (int i = 1; i <= number; i++) {

            num = i;

            for (int k = 1; k <= patternSize; k++) {
                System.out.print(num-- + " ");
            }
            patternSize++;
            System.out.println("");

        }

    }

    public static void main(String[] args) {
        int number = 5;
        pattern14(number);
    }
}
