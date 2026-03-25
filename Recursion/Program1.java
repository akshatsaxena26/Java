package Recursion;

import java.util.Scanner;

public class Program1 {
    public static void program1(int n) {
        if (n == 0) {
            return;

        }
        System.out.println(n + " ");
        program1(n - 1);
        System.out.println(n + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();

        program1(number);

    }
}
