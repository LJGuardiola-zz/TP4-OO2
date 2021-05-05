package exercises.e;

import exercises.e.model.ImportedShirt;
import exercises.e.model.NationalShirt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void calculate_price_of_imported_shirt() {
        assertEquals(135, new ImportedShirt(100).getFinalCost());
    }

    @Test
    void calculate_price_of_national_shirt() {
        assertEquals(93.38, new NationalShirt(100).getFinalCost());
    }

}
