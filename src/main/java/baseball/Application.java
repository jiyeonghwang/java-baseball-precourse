package baseball;

import baseball.utils.BaseballGame;
import baseball.view.InputView;
import baseball.view.OutputView;
import baseball.domain.Baseball;

import static baseball.utils.Validation.isReGameValidation;

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
