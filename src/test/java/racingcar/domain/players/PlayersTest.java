package racingcar.domain.players;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PlayersTest {
    @Test
    void 중복되는_이름이_존재하면_예외를_던진다() {
        final List<Player> players = List.of(
                new Player("dazzl"),
                new Player("dazzl"),
                new Player("koko"));

        assertThatThrownBy(() -> new Players(players))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }
}
