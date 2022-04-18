package baseball.View;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static final String INPUT_REQUEST = "숫자를 입력해주세요.: ";
    public static final String RE_GAME_REQUEST = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static String printInputRequest() {
        System.out.print(INPUT_REQUEST);
        return readLine();
    }

    public static String printInputReGame() {
        System.out.println(RE_GAME_REQUEST);
        return readLine();
    }
}
