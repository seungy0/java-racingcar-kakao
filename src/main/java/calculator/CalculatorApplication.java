package calculator;

import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();

        System.out.println("Enter the input: ");
        String input = scanner.nextLine();
        System.out.println("Result: " + calculatorController.add(input));

        scanner.close();
    }
}
