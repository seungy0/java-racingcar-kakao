package controller;

import java.util.List;
import model.RacingCar;
import model.RacingCars;
import view.RacingCarView;

public class RacingCarController {

    RacingCars racingCars;
    RacingCarView racingCarView;

    public RacingCarController(RacingCarView racingCarView) {
        this.racingCarView = racingCarView;
        this.racingCars = new RacingCars(racingCarView.getCarNames());
    }

    public void playGame() {
        int trial = racingCarView.getTrial();
        List<RacingCar> racingCarList = racingCars.getRacingCars();

        racingCarView.startGameRound();

        for (int i = 0; i < trial; i++) {
            playGameRound(racingCarList);
        }
    }

    private void playGameRound(List<RacingCar> racingCarList) {
        for (RacingCar racingCar : racingCarList) {
            racingCar.getNumAndMove();
        }
        racingCarView.displayRacingCarStatus(racingCarList);
    }
}
