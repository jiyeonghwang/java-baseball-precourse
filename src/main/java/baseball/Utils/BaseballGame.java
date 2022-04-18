package baseball.Utils;

import baseball.View.InputView;
import baseball.View.OutputView;
import baseball.domain.Baseball;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class BaseballGame {
    public String getComputerNumber() {
        String num = "";
        while (!Validation.isValidation(num)) {
            num = getNum();
        }
        return num;
    }

    public String getNum() {
        int result = pickNumberInRange(1, 9) * 100;
        result += pickNumberInRange(1, 9) * 10;
        result += pickNumberInRange(1, 9);
        return String.valueOf(result);
    }

    public void startGame(Baseball baseball) {
        String num = InputView.printInputRequest();
        if (!Validation.isValidation(num)) {
            throw new IllegalArgumentException(OutputView.getErrorMessage());
        }
        baseball.setUser(num);
        System.out.println(baseball.result());
        if (!baseball.isVictory()) {
            startGame(baseball);
        }
    }
}
