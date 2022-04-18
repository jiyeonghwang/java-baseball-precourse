package baseball;

import baseball.Utils.BaseballGame;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BaseballGameTest {
    @Test
    void createNumTest() {
        BaseballGame baseballGame = new BaseballGame();
        String num = baseballGame.getNum();

        assertThat(3).isEqualTo(num.length());
        assertThat(Integer.parseInt(num));
    }
}
