package baseball.Utils;

public class Validation {
    private Validation() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isValidation(String num) {
        if (num.length() > 3) return false;
        if (!num.matches("[1-9]+")) return false;
        if (num.charAt(0) == num.charAt(1) ||
                num.charAt(1) == num.charAt(2) ||
                num.charAt(0) ==num.charAt(2)) {
            return false;
        }
        return true;
    }
}
