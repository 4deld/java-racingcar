package racingcar.domain.players;

import java.util.Objects;

public class Player {
    private final Name name;
    private final Movement movement;

    public Player(String name) {
        this.name = new Name(name);
        this.movement = new Movement();
    }

    public String getName() {
        return name.getName();
    }

    public String getMovement() {
        return movement.getMovement();
    }

    public int getDistance() {
        return movement.getDistance();
    }

    public void race() {
        movement.move();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
