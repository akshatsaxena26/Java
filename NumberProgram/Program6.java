package NumberProgram;

public class Program6 {
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

    public static void main(String[] args) {
        int start = 100;
        int end = 200;
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }

        }

        System.out.println("Total prime number between" + start + end + "is :" + " " + count);
    }

}
