// Проверка на простое. O(√n)
public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        return isPrimeRec(n, 2);
    }
    private static boolean isPrimeRec(int n, int d) {
        if (d * d > n) return true;
        if (n % d == 0) return false;
        return isPrimeRec(n, d + 1);
    }
} 