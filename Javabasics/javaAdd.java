package Javabasics;

import java.util.Scanner;

public class javaAdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int choice;
        int even = 0;
        int odd = 0;

        do {
            System.out.print("Enter a number:");
            num = scan.nextInt();
            if (num % 2 == 0) {
                even += num;

            } else {
                odd += num;
            }

            System.out.println("Do you want to add more number press 1 else press 0");

            choice = scan.nextInt();

        } while (choice == 1);

        System.out.println("Sum oof even number:" + even);
        System.out.println("Sum oof odd number:" + odd);

    }

}
