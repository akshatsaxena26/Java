package Patterns;

public class Patttern12 {

    public static void pattern12(int number) {
        int spaceSize = number - 1;
        int patternSize = 1;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= spaceSize; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= patternSize; k++) {
                System.out.print(patternSize + " ");
            }
            System.out.println("");
            patternSize++;
            spaceSize--;
        }
    }

    public static void main(String[] args) {
        int number = 5;
        pattern12(number);
    }
}
