package Patterns;

public class Pattern15 {
    public static void pattern15(int number) {

        int mid = (number / 2) + 1;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {

                if (i == mid || j == mid // center cross
                        || (i == 1 && j >= mid) // top right
                        || (j == number && i >= mid) // bottom right
                        || (i == number && j <= mid) // bottom left
                        || (j == 1 && i <= mid)) { // top left

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number = 5;
        pattern15(number);
    }
}