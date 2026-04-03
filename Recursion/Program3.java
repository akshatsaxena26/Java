package Recursion;

import java.util.Scanner;

public class Program3 {

    public static void towerOfHanoi(int n, char source, char auxillary, char desination) {

        if (n == 1) {
            System.out.println("MOVE  FROM " + source + " OF" + desination);
            return;
        }
        towerOfHanoi(n - 1, source, desination, auxillary);
        System.out.println("MOVE  FROM " + source + " OF" + desination);
        towerOfHanoi(n - 1, auxillary, source, desination);

    }

    public static void main(String[] args) {
        int n = 10;

        towerOfHanoi(n, 'A', 'B', 'C');

    }

}
