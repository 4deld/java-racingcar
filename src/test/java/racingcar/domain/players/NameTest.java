package racingcar.domain.players;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    @DisplayName("이름이 존재하지 않으면 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"", "     "})
    void ValueIsNotExist(String value) {
        assertThatThrownBy(() -> new Name(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }

    @DisplayName("이름이 글자수를 초과하면 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"123456", "aaaaaaaaaaaa", "-100770"})
    void ValueExceedsLength(String value) {
        assertThatThrownBy(() -> new Name(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }
}
