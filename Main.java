// Тест всех задач
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {10, 1, 32, 3, 45};
        System.out.println("1. Min: " + FindMin.findMin(arr1));
        int[] arr2 = {3, 2, 4, 1};
        System.out.println("2. Avg: " + AverageCalculator.calculateAverage(arr2));
        int n1 = 7, n2 = 10;
        System.out.println("3. " + n1 + (PrimeChecker.isPrime(n1) ? " Prime" : " Composite"));
        System.out.println("3. " + n2 + (PrimeChecker.isPrime(n2) ? " Prime" : " Composite"));
        int n3 = 5;
        System.out.println("4. " + n3 + "! = " + FactorialCalculator.factorial(n3));
        int n4 = 5, n5 = 17;
        System.out.println("5. F(" + n4 + ") = " + FibonacciCalculator.fibonacci(n4));
        System.out.println("5. F(" + n5 + ") = " + FibonacciCalculator.fibonacci(n5));
        int a = 2, n6 = 10;
        System.out.println("6. " + a + "^" + n6 + " = " + PowerCalculator.power(a, n6));
        int[] arr3 = {2, 6, 4, 1};
        System.out.print("7. Reverse: ");
        ReversePrinter.printReverse(arr3, arr3.length - 1);
        String s1 = "123456", s2 = "123a12";
        System.out.println("8. " + s1 + " " + (DigitStringChecker.isAllDigits(s1) ? "Yes" : "No"));
        System.out.println("8. " + s2 + " " + (DigitStringChecker.isAllDigits(s2) ? "Yes" : "No"));
        int n7 = 2, k1 = 1, n8 = 7, k2 = 3;
        System.out.println("9. C(" + n7 + "," + k1 + ") = " + BinomialCoefficientCalculator.binomialCoefficient(n7, k1));
        System.out.println("9. C(" + n8 + "," + k2 + ") = " + BinomialCoefficientCalculator.binomialCoefficient(n8, k2));
        int a1 = 32, b1 = 48, a2 = 10, b2 = 7;
        System.out.println("10. GCD(" + a1 + "," + b1 + ") = " + GCDCalculator.gcd(a1, b1));
        System.out.println("10. GCD(" + a2 + "," + b2 + ") = " + GCDCalculator.gcd(a2, b2));
    }
} 