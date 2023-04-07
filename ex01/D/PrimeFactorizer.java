import java.util.Scanner;

class PrimeFactorizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.printf("%d:", n);

        // prime factorize
        for (int p = 2; p * p <= n; p++) {
            while (n % p == 0) {
                n /= p;
                System.out.printf(" %d", p);
            }
        }

        if (n != 1) System.out.printf(" %d", n);
        System.out.println();
        
        sc.close();
    }
}