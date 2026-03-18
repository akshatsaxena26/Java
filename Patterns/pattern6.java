package Patterns;

public class pattern6 {
    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("(" + i + "," + j + ")");

            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        int n = 5;
        pattern6(n);

    }

}
