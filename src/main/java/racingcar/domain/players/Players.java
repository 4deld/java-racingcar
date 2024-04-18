package racingcar.domain.players;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Players {
    private final List<Player> players;

    public Players(final List<Player> players) {
        validateDuplicate(players);
        this.players = List.copyOf(players);
    }
    private void validateDuplicate(final List<Player> players) {
        final Set<Player> uniquePlayers = new HashSet<>(players);

        if (uniquePlayers.size() != players.size()) {
            throw new IllegalArgumentException("[ERROR] 참가자 이름은 중복될 수 없습니다.");
        }
    }
    public void race() {
        players.forEach(Player::race);
    }

    public List<Player> getPlayers() {
        return players;
    }

}
