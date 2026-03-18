package Patterns;

public class Pattern13 {
    public static void pattern13(int number) {
        int spaceSize = number - 1;
        int patternSize = 1;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= spaceSize; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= patternSize; k++) {
                if (patternSize == 1) {
                    System.out.print("0");
                } else {
                    System.out.print("1 ");
                }

            }
            System.out.println("");
            spaceSize--;
            // patternSize++;

        }

    }

    public static void main(String[] args) {
        int number = 5;
        pattern13(number);
    }
}
