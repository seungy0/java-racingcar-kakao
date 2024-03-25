package model;

import java.util.Random;

public class RacingCar {

    private String name;
    private int moves = 0;

    public RacingCar() {
    }

    public RacingCar(String name) {
        this.name = name;
    }

    public void getNumAndMove() {
        int num = getRandomNum();
        if (move(num)) {
            this.moves++;
        }
    }

    public boolean move(int num) {
        return num >= 4 && num <= 9;
    }

    public String getName() {
        return name;
    }

    public int getMoves() {
        return moves;
    }

    private static int getRandomNum() {
        Random random = new Random();
        return random.nextInt(9);
    }
}
