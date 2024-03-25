package view;

import java.util.List;
import java.util.Scanner;

public class RacingCarView {

    Scanner sc;

    public RacingCarView() {
        sc = new Scanner(System.in);
    }

    public List<String> getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return List.of(sc.nextLine().split(","));
    }
}
