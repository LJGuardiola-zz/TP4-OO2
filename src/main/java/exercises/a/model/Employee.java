package exercises.a.model;

import java.util.Set;

public interface Employee {
    double getTotalSalary();
    Set<Employee> getSubordinates();
    void addSubordinate(Employee employee);
    void removeSubordinates(Employee employee);
}
