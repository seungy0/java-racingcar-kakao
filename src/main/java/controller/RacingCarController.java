package controller;

import exception.InValidInputException;
import java.util.List;
import model.RacingCar;
import model.RacingCars;
import view.RacingCarView;

public class RacingCarController {

    RacingCars racingCars;
    RacingCarView racingCarView;

    public RacingCarController(RacingCarView racingCarView) {
        this.racingCarView = racingCarView;
        this.racingCars = new RacingCars(getCarNames());
    }

    public void playGame() {
        int trial = racingCarView.getTrial();
        List<RacingCar> racingCarList = racingCars.getRacingCars();

        racingCarView.startGameRound();

        for (int i = 0; i < trial; i++) {
            playGameRound(racingCarList);
        }

        racingCarView.displayWinners(racingCars.getWinners());
    }

    private void playGameRound(List<RacingCar> racingCarList) {
        for (RacingCar racingCar : racingCarList) {
            racingCar.move();
        }
        racingCarView.displayRacingCarStatus(racingCarList);
    }

    private List<String> getCarNames() {
        // TODO: indent 줄이기
        while (true) {
            try {
                return racingCarView.getCarNames();
            } catch (InValidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
