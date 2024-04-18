package racingcar.domain.trycount;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TryCountTest {

    @DisplayName("횟수가 정수가 아니면 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"100j", "aaaa10","bbbb"})
    void ValueIsNotAnInteger(String value) {
        assertThatThrownBy(() -> new TryCount(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }

    @DisplayName("횟수가 0 이하면 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"0", "-1", "-1000", "-123123"})
    void ValueIsLessThanZero(String value) {
        assertThatThrownBy(() -> new TryCount(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }


}
