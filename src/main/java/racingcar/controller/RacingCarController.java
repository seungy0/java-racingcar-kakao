package racingcar.controller;

import java.util.List;
import racingcar.exception.InValidInputException;
import racingcar.model.RacingGame;
import racingcar.view.RacingCarView;

public class RacingCarController {

    private final RacingCarView racingCarView;

    public RacingCarController(RacingCarView racingCarView) {
        this.racingCarView = racingCarView;
    }

    public void playGame() {
        List<String> carNames = requestCarNames();
        int trial = racingCarView.requestTrial();
        RacingGame racingGame = new RacingGame(carNames, trial);

        racingCarView.startGameRound();

        while (!racingGame.isGameEnd()) {
            racingGame.playGameRound();
            racingCarView.displayRacingCarStatus(racingGame.getRacingCars());
        }

        racingCarView.displayWinners(racingGame.findWinners());
    }

    private List<String> requestCarNames() {
        while (true) {
            try {
                return racingCarView.requestCarNames();
            } catch (InValidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
