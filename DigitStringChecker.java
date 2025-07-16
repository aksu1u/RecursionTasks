// Проверка строки на цифры. O(n)
public class DigitStringChecker {
    public static boolean isAllDigits(String s) {
        return isAllDigitsRec(s, 0);
    }
    private static boolean isAllDigitsRec(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return isAllDigitsRec(s, i + 1);
    }
} 