import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Ints;
import ru.netology.IntsCalculator;

public class TestCalculator {

    @Test
    public void testCalculator() {
        Ints calc = new IntsCalculator();

        int result_sum = calc.sum(22, 33);
        int expected_sum = 55;

        int result_mult = calc.mult(6, 6);
        int expected_mult = 36;

        int result_pow = calc.pow(2, 4);
        int expected_pow = 16;

        Assertions.assertEquals(expected_sum, result_sum);
        Assertions.assertEquals(expected_mult, result_mult);
        Assertions.assertEquals(expected_pow, result_pow);
    }
}
