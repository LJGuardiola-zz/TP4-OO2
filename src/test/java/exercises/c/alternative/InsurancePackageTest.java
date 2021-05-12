package exercises.c.alternative;

import exercises.c.alternative.model.Insurance;
import exercises.c.alternative.model.InsurancePackage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsurancePackageTest {

    @Test
    void get_total_package_cost() {

        InsurancePackage insurancePackage = new InsurancePackage();

        Insurance car = new Insurance(1250);
        insurancePackage.add(car);

        Insurance house = new Insurance(4250);
        insurancePackage.add(house);

        Insurance life = new Insurance(520);
        insurancePackage.add(life);

        int total = (1250 + 4250 + 520) * 3 * 5 / 100;

        Assertions.assertEquals(
                total, insurancePackage.getCost()
        );

    }

}
