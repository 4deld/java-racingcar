package racingcar.domain;

import racingcar.domain.players.Players;
import racingcar.domain.trycount.TryCount;

public class RacingGame {
    private final Players players;

    private final TryCount tryCount;

    public RacingGame(Players players, TryCount tryCount) {
        this.players = players;
        this.tryCount = tryCount;
    }

    public void startRace() {
        players.race();
    }

}
