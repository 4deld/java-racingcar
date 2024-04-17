package racingcar.domain;

import racingcar.domain.players.Player;
import racingcar.domain.players.Players;
import racingcar.domain.trycount.TryCount;

import java.util.List;
import java.util.stream.Collectors;

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

    public int getTryCount() {
        return tryCount.getTryCount();
    }

    public List<Player> getPlayers() {
        return players.getPlayers();
    }

    public List<Player> findWinners() {
        int maxDistance = getMaxDistance();
        return players.getPlayers().stream()
                .filter(p -> p.getDistance() == maxDistance)
                .collect(Collectors.toList());
    }
    private int getMaxDistance() {
        return players.getPlayers().stream()
                .mapToInt(Player::getDistance)
                .max()
                .orElse(0);
    }
}

