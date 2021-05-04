package exercises.a;

import exercises.a.model.Company;
import exercises.a.model.Employee;
import exercises.a.model.EmployeeInCharge;
import exercises.a.model.RegularEmployee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompanyTest {

    @Test
    void get_total_salary_cost() {

        Company laserX = new Company();

        Employee director = new EmployeeInCharge("Fabian Lopez", 8500);
        laserX.assignDirector(director);

        Employee manager = new EmployeeInCharge("Maria Gomez", 6000);
        director.addSubordinate(manager);

        Employee middle = new EmployeeInCharge("Rodrigo Ruiz", 4000);
        manager.addSubordinate(middle);

        Employee leader = new EmployeeInCharge("Sofia Rodriguez", 3200);
        manager.addSubordinate(leader);
        
        leader.addSubordinate(new RegularEmployee("Pedro Gutierrez", 2500));
        leader.addSubordinate(new RegularEmployee("Marcela Tolosa", 2600));

        double total = 2500 + 2600 + 3200 + 4000 + 6000 + 8500;

        Assertions.assertEquals(
                total, laserX.getTotalSalaryCost()
        );

    }

}
