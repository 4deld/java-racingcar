package racingcar.domain.players;

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
            throw new IllegalArgumentException("[ERROR] 이름은 존재해야 합니다. 현재 이름: " + input);
        }
    }

    private void validateLength(final String input) {
        if (input.length() > UPPER_BOUND) {
            throw new IllegalArgumentException("이름은 " + UPPER_BOUND + "글자 이하여야 합니다. 현재 이름: " + input);
        }
    }

    public String getName() {
        return name;
    }

}
