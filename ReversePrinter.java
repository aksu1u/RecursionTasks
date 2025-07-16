// Вывод массива в обратном порядке. O(n)
public class ReversePrinter {
    public static void printReverse(int[] arr, int idx) {
        if (idx < 0) return;
        System.out.print(arr[idx] + (idx == 0 ? "\n" : " "));
        printReverse(arr, idx - 1);
    }
} 