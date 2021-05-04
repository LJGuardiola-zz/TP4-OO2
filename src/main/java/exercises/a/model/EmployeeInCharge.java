package exercises.a.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EmployeeInCharge implements Employee {

    private final String name;
    private final double salary;
    private final Set<Employee> subordinates;

    public EmployeeInCharge(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new HashSet<>();
    }

    @Override
    public double getTotalSalary() {
        return salary + subordinates.stream().mapToDouble(Employee::getTotalSalary).sum();
    }

    @Override
    public Set<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    @Override
    public void removeSubordinates(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeInCharge that = (EmployeeInCharge) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
