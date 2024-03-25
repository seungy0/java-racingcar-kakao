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

    public int getTrial() {
        System.out.println("시도할 회수는 몇회인가요?");
        return Integer.parseInt(sc.nextLine());
    }
}
