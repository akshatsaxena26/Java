/*
 * package Recursion;
 * 
 * import java.util.Scanner;
 * 
 * public class Program2 {
 * public static int program2(int n) {
 * if (n == 0 || n == 1) {
 * return 1;
 * }
 * return n * program2(n - 1);
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter a number:");
 * int number = sc.nextInt();
 * 
 * System.out.println(program2(number));
 * 
 * }
 * }
 */
package Recursion;

import java.util.Scanner;

public class Program2 {
    public static int program2(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * program2(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();

        System.out.println(program2(number));

    }
}
