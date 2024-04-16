package racingcar.domain.random;

import org.kokodak.Randoms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Random {
    private final int random;

    public Random() {
        this.random =Randoms.pickNumberInRange(1, 9);
    }

    public int getRandom() {
        return random;
    }
}
