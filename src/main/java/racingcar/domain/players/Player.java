package racingcar.domain.players;

public class Player {
    private final Name name;
    private Movement movement;

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
        return movement.getMovement().length();
    }

    public void race() {
        movement.move();
    }
}
