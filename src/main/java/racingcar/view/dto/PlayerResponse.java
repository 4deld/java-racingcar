package racingcar.view.dto;

import racingcar.domain.players.Player;

public class PlayerResponse {
    private final String name;
    private final String movement;

    private PlayerResponse(final String name, final String movement) {
        this.name = name;
        this.movement = movement;
    }

    public static PlayerResponse from(final Player player) {
        final String name = player.getName();
        final String movement = player.getMovement();
        return new PlayerResponse(name, movement);
    }

    public String getName() {
        return name;
    }
    public String getMovement() {
        return movement;
    }

}
