package baseball.View;

public class OutputView {
    private static final String ERROR_MESSAGE = "잘못된 값을 입력하였습니다.";
    public static final String GAME_VICTORY = "3개의 숫자를 모두 맞히셨습니다!";
    private static final String GAME_END = "게임 종료";
    private static final int STANDARD_END = 2;
    public static String getErrorMessage() {
        return ERROR_MESSAGE;
    }

    public static void printResult() {
        System.out.println(GAME_VICTORY);
    }

    public static boolean printGameEnd(int input) {
        boolean result = true;
        if (input == STANDARD_END) {
            System.out.println(GAME_END);
            result = false;
        }
        return result;
    }
}
