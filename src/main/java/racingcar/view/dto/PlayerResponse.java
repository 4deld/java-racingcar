package racingcar.view.dto;

import racingcar.domain.players.Player;

public class PlayerResponse {
    private final String name;
    private final String distance;

    private PlayerResponse(final String name, final String distance) {
        this.name = name;
        this.distance = distance;
    }

    public static PlayerResponse from(final Player player) {
        final String name = player.getName();
        final String distance = player.getDistance();
        return new PlayerResponse(name, distance);
    }

    public String getName() {
        return name;
    }
    public String getDistance() {
        return distance;
    }

}
