package exercises.d;

import exercises.d.model.LogTransaction;
import exercises.d.model.NotRetiredCalculator;
import exercises.d.model.RetiredCalculator;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void calculate_price_in_promotion_month() {
        Month actualMonth = LocalDate.now().getMonth();
        assertEquals(100, new RetiredCalculator(new LogTransaction(), actualMonth).calculate(100));
        assertEquals(115, new NotRetiredCalculator(new LogTransaction(), actualMonth).calculate(100));
    }

    @Test
    void calculate_price_in_normal_month() {
        Month month = LocalDate.now().getMonth().minus(1);
        assertEquals(110, new RetiredCalculator(new LogTransaction(), month).calculate(100));
        assertEquals(121, new NotRetiredCalculator(new LogTransaction(), month).calculate(100));
    }

}
