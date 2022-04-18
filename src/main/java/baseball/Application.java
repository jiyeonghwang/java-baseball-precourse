package baseball;

import baseball.Utils.BaseballGame;
import baseball.View.InputView;
import baseball.View.OutputView;
import baseball.domain.Baseball;

import static baseball.Utils.Validation.isReGameValidation;

public class Application {
    public static void main(String[] args) {
        do {
            BaseballGame baseballGame = new BaseballGame();
            Baseball baseball = new Baseball();
            baseball.setComputer(baseballGame.getComputerNumber());
            baseballGame.startGame(baseball);
        } while (Application.isNewGame());
    }

    public static boolean isNewGame() {
        OutputView.printResult();
        String input = InputView.printInputReGame();
        if (!isReGameValidation(input)) {
            OutputView.getErrorMessage();
        }
        return OutputView.printGameEnd(Integer.parseInt(input));
    }
}
