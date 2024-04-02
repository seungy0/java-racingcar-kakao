package racingcar.model;

import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {

    private final List<RacingCar> racingCars;
    private final int trial;
    private int round = 0;

    public RacingGame(List<String> carNames, int trial) {
        this.racingCars = carNames.stream()
            .map(RacingCar::new)
            .collect(Collectors.toList());
        this.trial = trial;
    }

    public List<RacingCar> findWinners() {
        int maxMoves = racingCars.stream()
            .mapToInt(RacingCar::getPosition)
            .max()
            .orElse(0);

        return racingCars.stream()
            .filter(car -> car.getPosition() == maxMoves)
            .collect(Collectors.toList());
    }

    public void playGameRound() {
        racingCars.forEach(RacingCar::move);
        round++;
    }

    public boolean isGameEnd() {
        return round == trial;
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }
}
