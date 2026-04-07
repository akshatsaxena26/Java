package NumberProgram;

public class Program3 {

    public static void printAndCountAFactor(int n) {

        if (n == 1) {
            System.out.print(1);
            System.out.println("TOTAL FACTOR" + 1);
        }
        System.out.print(1 + n);
        int count = 2;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int fact1 = i;
                int fact2 = n / 2;
                if (fact1 != fact2) {
                    System.out.println(
                            fact1 + fact2);
                    count += 2;
                } else {
                    System.out.print(fact1);
                    count += 1;
                }
            }

        }
        System.out.println("TOTAL FACTOR " + count);

    }

    public static void main(String[] args) {

    }

}
