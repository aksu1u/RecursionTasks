// НОД. O(log n)
public class GCDCalculator {
    public static int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }
} 