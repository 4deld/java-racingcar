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

    public void getPlayers() {
        for(Player p:this.players){
            System.out.println(p.getName());
            System.out.println(p.getDistance());
            System.out.println();
            System.out.println();
        }

    }
}
