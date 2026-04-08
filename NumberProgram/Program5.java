package NumberProgram;

public class Program5 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getKth(int k) {
        int count = 0;
        for (int i = 2;; i++) {
            if (isPrime(i)) {
                count++;
            }
            if (count == k) {
                return i;
            }
        }

    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(getKth(n));
    }

}
