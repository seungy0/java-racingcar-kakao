import controller.RacingCarController;
import view.RacingCarView;

public class RacingCarApplication {

    public static void main(String[] args) {
        RacingCarView racingCarView = new RacingCarView();
        RacingCarController racingCarController = new RacingCarController(racingCarView);
    }
}