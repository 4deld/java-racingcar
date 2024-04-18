package racingcar.domain.players;

import java.util.Objects;

public class Name {

    private static final int UPPER_BOUND = 5;
    private final String name;

    public Name(final String input) {
        validate(input);
        this.name = input;
    }

    private void validate(final String input) {
        validateNullAndBlank(input);
        validateLength(input);
    }

    private void validateNullAndBlank(final String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("[ERROR] 이름이 존재하지 않습니다.");
        }
    }

    private void validateLength(final String input) {
        if (input.length() > UPPER_BOUND) {
            throw new IllegalArgumentException("[ERROR] 이름은 " + UPPER_BOUND + "글자 이하여야 합니다. 현재 이름: " + input);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Name n = (Name) o;
        return Objects.equals(name, n.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
