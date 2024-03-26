package calculator;

import java.util.Arrays;
import java.util.List;

public class Delimiter {

    List<String> delimiters;

    public Delimiter() {
        delimiters = Arrays.asList(",", ":");
    }

    public List<String> split(String s) {
        return Arrays.asList(s.split(this.makeRegex()));
    }

    private String makeRegex() {
        return "[" + String.join("", delimiters) + "]";
    }
}
