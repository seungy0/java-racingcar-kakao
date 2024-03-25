package controller;

import java.util.List;
import java.util.stream.IntStream;
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

        IntStream.range(0, trial)
            .mapToObj(i -> racingCarList)
            .forEach(this::playGameRound);

        racingCarView.displayWinners(racingCars.getWinners());
    }

    private void playGameRound(List<RacingCar> racingCarList) {
        for (RacingCar racingCar : racingCarList) {
            racingCar.move();
        }
        racingCarView.displayRacingCarStatus(racingCarList);
    }
}
