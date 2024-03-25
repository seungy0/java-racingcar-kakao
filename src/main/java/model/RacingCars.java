package model;

import java.util.List;
import java.util.stream.Collectors;

public class RacingCars {

    List<RacingCar> racingCars;

    public RacingCars(List<String> carNames) {
        this.racingCars = carNames.stream()
            .map(RacingCar::new)
            .collect(Collectors.toList());
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }
}
