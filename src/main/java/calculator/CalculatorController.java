package calculator;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorController {

    public Optional<String> parseCustomDelimiter(String input) {
        String regex = "//(.)\n.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return Optional.ofNullable(matcher.group(1));
        }
        return Optional.empty();
    }
}
