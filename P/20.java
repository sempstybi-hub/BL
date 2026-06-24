import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {

    // тестируем метод возведения в квадрат
    public int square(int x) {
        return x * x;
    }

    @ParameterizedTest
    @CsvSource({
            "2, 4",
            "3, 9",
            "4, 16",
            "-5, 25",
            "0, 0"
    })
    void testSquare(int input, int expected) {

        assertEquals(expected, square(input));
    }
}