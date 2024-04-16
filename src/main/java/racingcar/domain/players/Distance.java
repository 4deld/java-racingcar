package racingcar.domain.players;

import racingcar.domain.random.Random;

public class Distance {
    private String distance="";

    private void move(){
        final Random random = new Random();
        if(random.getRandom()>=4)
            moveForward();
    }

    public void moveForward(){
        this.distance+="-";
    }

    public String getDistance() {
        return distance;
    }
}
