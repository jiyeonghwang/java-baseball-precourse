package baseball;

import baseball.Utils.BaseballGame;
import baseball.View.InputView;
import baseball.domain.Baseball;

import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Application {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        Baseball baseball = new Baseball();
        baseball.setComputer(baseballGame.getComputerNumber());
        baseballGame.startGame(baseball);
    }
}
