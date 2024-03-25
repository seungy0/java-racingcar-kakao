package controller;

import model.RacingCars;
import view.RacingCarView;

public class RacingCarController {

    RacingCars racingCars;
    RacingCarView racingCarView;

    public RacingCarController(RacingCarView racingCarView) {
        this.racingCarView = racingCarView;
        this.racingCars = new RacingCars(racingCarView.getCarNames());
    }
}
