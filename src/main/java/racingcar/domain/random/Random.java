package racingcar.domain.random;

import org.kokodak.Randoms;

public class Random {
    private final int random;

    public Random() {
        this.random = Randoms.pickNumberInRange(0, 9);
    }

    public int getRandom() {
        return random;
    }
}
