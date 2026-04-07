package NumberProgram;

public class Program2 {

    public static int program2(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                sum += i;
                n /= i;
            }
        }

        return sum;

    }

    public static void main(String[] args) {

        int n = 32;
        program2(n);

    }

}