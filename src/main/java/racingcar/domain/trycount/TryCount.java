package racingcar.domain.trycount;

public class TryCount {

    private static final String NOT_AN_INTEGER = "[ERROR] 정수가 아닙니다.";
    private static final String LESS_THAN_ZERO = "[ERROR] 정수가 0보다 작습니다.";

    private static final String INTEGER_REGEX = "[+-]?\\d*(\\.\\d+)?";
    private final int cnt;


    public TryCount(String input) {
        validate(input);
        this.cnt = Integer.parseInt(input);
    }
    private void validate(final String input) {
        validateInteger(input);
        validateBiggerThanZero(Integer.parseInt(input));
    }
    private void validateInteger(final String input) {
        if (!(input.matches(INTEGER_REGEX))) {
            throw new IllegalArgumentException(NOT_AN_INTEGER);
        }
    }
    private void validateBiggerThanZero(final int input) {
        if (input<=0) {
            throw new IllegalArgumentException(LESS_THAN_ZERO);
        }
    }
}
