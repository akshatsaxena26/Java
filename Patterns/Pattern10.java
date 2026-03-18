package Patterns;

public class Pattern10 {

    public static void pattern10(int number) {
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number = 5;
        pattern10(number);
    }
}