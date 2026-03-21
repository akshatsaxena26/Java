package Patterns;

import java.util.*;

public class Pattern16 {

    public static void pattern16(int number) {
        int num = number * (number + 1) / 2;
        int patternSize = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= patternSize; j++) {
                System.out.print(num++ + "\t ");

            }
            num = num - (2 * i + 1);
            patternSize++;

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int number = sc.nextInt();
        sc.close();

        pattern16(number);

    }
}
