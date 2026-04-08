package NumberProgram;

import java.util.*;

public class Program7 {
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

    public static List<Integer> storePrime(int n) {
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        for (int i = 2;; i++) {
            if (isPrime(i)) {
                count++;
                primes.add(i);
                if (count == n) {
                    return primes;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Range");
        int Range = sc.nextInt();
        System.out.println(storePrime(Range));

    }

}
