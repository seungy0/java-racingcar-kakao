import calculator.Delimiter;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void splitTest() {
        Delimiter delimiter = new Delimiter();

        List<String> nums = delimiter.split("1,2:3");

        Assertions.assertEquals(nums.get(0), "1");
        Assertions.assertEquals(nums.get(1), "2");
        Assertions.assertEquals(nums.get(2), "3");
    }
}
