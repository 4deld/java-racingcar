package racingcar.domain.players;

import java.util.List;

public class Players {
    private final List<Player> players;

    public Players(final List<Player> players) {
        validate(players);
        this.players = List.copyOf(players);
    }
    private void validate(final List<Player> players) {
    }

    public void race() {
        players.forEach(player -> player.race());
    }

    public List<Player> getPlayers() {
        return players;
    }
}
