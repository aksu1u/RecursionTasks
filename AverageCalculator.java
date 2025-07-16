// Среднее массива. O(n)
public class AverageCalculator {
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return (double) sum / arr.length;
    }
} 