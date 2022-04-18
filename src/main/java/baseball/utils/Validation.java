package baseball.utils;

public class Validation {
    public static boolean isValidation(String num) {
        if (num.length() != 3) return false;
        if (!num.matches("[1-9]+")) return false;
        if (num.charAt(0) == num.charAt(1) ||
                num.charAt(1) == num.charAt(2) ||
                num.charAt(0) ==num.charAt(2)) {
            return false;
        }
        return true;
    }

    public static boolean isReGameValidation(String input) {
        boolean result = true;
        if (!input.matches("[1-2]+") || input.length() > 1) {
            result = false;
        }
        return result;
    }
}
