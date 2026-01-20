import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testCalculateBasicExpression() {
        // Testira prioritet operacija: 10 + 5 * 2 = 20.0
        String result = Calculator.Run("10+5*2");
        assertEquals("20.0", result, "Test failed: 10+5*2 should be 20.0");
    }
}
