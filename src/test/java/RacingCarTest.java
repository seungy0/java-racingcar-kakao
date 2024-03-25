import model.RacingCar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

    private RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar();
    }

    @Test
    void moveTest() {
        for (int i = 4; i < 10; i++) {
            boolean move = racingCar.move(i);
            Assertions.assertTrue(move);
        }
    }

    @Test
    void stopTest() {
        for (int i = 0; i < 4; i++) {
            boolean move = racingCar.move(i);
            Assertions.assertFalse(move);
        }
    }
}
