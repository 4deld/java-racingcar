package racingcar.domain.players;

public class Player {
    private final Name name;
    private Distance distance;

    public Player(String name) {
        this.name = new Name(name);
        this.distance = new Distance();
    }

    public String getName() {
        return name.getName();
    }

    public String getDistance() {
        return distance.getDistance();
    }
}
