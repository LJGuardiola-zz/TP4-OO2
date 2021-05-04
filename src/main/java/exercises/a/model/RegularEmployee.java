package exercises.a.model;

import java.util.Objects;
import java.util.Set;

public class RegularEmployee implements Employee {

    private final String name;
    private final double salary;

    public RegularEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getTotalSalary() {
        return salary;
    }

    @Override
    public Set<Employee> getSubordinates() {
        throw new RuntimeException("Not allowed");
    }

    @Override
    public void addSubordinate(Employee employee) {
        throw new RuntimeException("Not allowed");
    }

    @Override
    public void removeSubordinates(Employee employee) {
        throw new RuntimeException("Not allowed");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegularEmployee that = (RegularEmployee) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
