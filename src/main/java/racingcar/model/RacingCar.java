package racingcar.model;

import java.util.Random;

public class RacingCar {

    private final String name;
    private int moves = 0;

    public RacingCar(String name) {
        this.name = name;
    }

    public void getNumAndMove(int num) {
        if (moveOrNot(num)) {
            this.moves++;
        }
    }

    public void move() {
        int num = makeRandomNum();
        getNumAndMove(num);
    }

    public boolean moveOrNot(int num) {
        return num >= 4 && num <= 9;
    }

    public String getName() {
        return name;
    }

    public int getMoves() {
        return moves;
    }

    private static int makeRandomNum() {
        Random random = new Random();
        return random.nextInt(9);
    }
}
