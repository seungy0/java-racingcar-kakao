package calculator;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CalculatorController {

    Delimiter delimiter;

    public CalculatorController() {
        this.delimiter = new Delimiter();
    }

    public Optional<String> parseCustomDelimiter(String input) {
        String regex = "//(.)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return Optional.ofNullable(matcher.group(1));
        }
        return Optional.empty();
    }

    public void validateInput(String input) {
        String regex = "^(?://.\n)?(?:\\d[:," + parseCustomDelimiter(input).orElse("") + "])*\\d+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid input format");
        }
    }

    public List<Integer> parseNumber(String input) {
        input = input.replaceAll("//(.*)\n", "");
        return delimiter.split(input).stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }

    public int add(String input) {
        input = input.replace("\\n", "\n");
        validateInput(input);
        delimiter.addCustomDelimiter(parseCustomDelimiter(input).orElse(""));
        List<Integer> numbers = parseNumber(input);
        return numbers.stream()
            .reduce(0, Integer::sum);
    }
}
