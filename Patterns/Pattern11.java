package Patterns;

public class Pattern11 {

    public static void pattern11(int number) {
        int spaceSize = number - 1;
        int patternSize = 1;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= spaceSize; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= patternSize; k++) {
                if ((i + k) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            spaceSize--;
            patternSize++;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int number = 5;
        pattern11(number);
    }
}