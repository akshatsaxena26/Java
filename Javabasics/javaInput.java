package Javabasics;

import java.util.*;

public class javaInput {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String input = scann.nextLine(); // Reads full line
        System.out.println(input);
        scann.close();
    }
}
