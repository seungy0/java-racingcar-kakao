package model;

import java.util.Random;

public class RacingCar {

    private String name;

    public RacingCar() {
    }

    public RacingCar(String name) {
        this.name = name;
    }

    public boolean getNumAndMove() {
        int num = getRandomNum();
        return move(num);
    }

    public boolean move(int num) {
        return num >= 4 && num <= 9;
    }

    private static int getRandomNum() {
        Random random = new Random();
        return random.nextInt(9);
    }
}
