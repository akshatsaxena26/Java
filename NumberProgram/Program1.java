package NumberProgram;

public class Program1 {

    public static void program1(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }

    }

    public static void main(String[] args) {

        int n = 32;
        program1(n);

    }

}

// PRIME FACTOR NUMBER PROGRAM
