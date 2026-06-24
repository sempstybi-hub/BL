import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    void testDivisionByZeroThrowsException() {

        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    }
}