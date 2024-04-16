package racingcar.domain.trycount;

import racingcar.domain.trycount.TryCount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TryCountTest {
    @DisplayName("횟수가 0 이하면 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"0", "-1", "-1000", "-123123"})
    void AmountIsLessThan0(String amount) {
        assertThatThrownBy(() -> new TryCount(amount))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }
}
