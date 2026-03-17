package Javabasics;

import java.util.Scanner;

public class javaFactorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int factorial = 1;
        System.out.println("Enter a number to know the factorial");
        int user = scan.nextInt();

        for (int i = 1; i <= user; i++) {
            factorial *= i;

        }

        System.out.println("The factorial of your number is :" + factorial);

    }

}
