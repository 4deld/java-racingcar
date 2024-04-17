package racingcar.domain.players;

import racingcar.domain.random.Random;

public class Movement {
    private String movement ="";

    public void move(){
        final Random random = new Random();
        if(random.getRandom()>=4)
            moveForward();
    }

    private void moveForward(){
        this.movement +="-";
    }

    public String getMovement() {
        return movement;
    }
}
