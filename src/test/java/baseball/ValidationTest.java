package baseball;

import org.junit.jupiter.api.Test;

import static baseball.utils.Validation.isReGameValidation;
import static org.junit.jupiter.api.Assertions.*;

import static baseball.utils.Validation.isValidation;

public class ValidationTest {
    @Test
    void isValidationTest() {
        // 3자리 수 미만
        assertFalse(isValidation("12"));

        // 3자리수 초과
        assertFalse(isValidation("1234"));

        // 숫자 외 문자가 있는 경우
        assertFalse(isValidation("Aaㅎ"));

        // 중복되는 수
        assertFalse(isValidation("111"));

        //위의 경우가 아닌 수
        assertTrue(isValidation("123"));
    }

    @Test
    void isReGameValidationTest() {
        // 1자리 수 이상
        assertFalse(isReGameValidation("12"));

        // 숫자 외 문자가 있는 경우
        assertFalse(isReGameValidation("A"));

        // 1 or 2인 경우 True
        assertTrue(isReGameValidation("1"));
        assertTrue(isReGameValidation("2"));
    }
}
