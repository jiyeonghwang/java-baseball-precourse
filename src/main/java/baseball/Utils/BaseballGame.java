package baseball.Utils;

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
}
