package calculator;

import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Calculator calculator = new Calculator();

            System.out.println("Enter the input: ");
            String input = scanner.nextLine();

            System.out.println(
                "Result: " + calculator.add(input));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
