package baseball.View;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static final String INPUT_REQUEST = "숫자를 입력해주세요.: ";

    public static String printInputRequest() {
        System.out.print(INPUT_REQUEST);
        return readLine();
    }
}
