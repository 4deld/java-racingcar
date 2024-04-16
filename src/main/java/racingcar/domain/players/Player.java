package racingcar.domain.players;

public class Player {
    private final Name name;

    private Distance distance;

    public Player(String name) {
        this.name = new Name(name);
    }

    public String getName() {
        return name.getName();
    }

    public Distance getDistance() {
        return distance;
    }
}
