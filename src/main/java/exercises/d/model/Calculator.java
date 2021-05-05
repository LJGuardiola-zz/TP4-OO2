package exercises.d.model;

import java.time.Month;

import static java.time.LocalDate.now;

public abstract class Calculator {

    private final Month promotionalMonth;

    public Calculator(Month promotionalMonth) {
        this.promotionalMonth = promotionalMonth;
    }

    public double calculate(double cost) {
        return promotionalMonth.equals(now().getMonth())
                ? promotionalCost(cost)
                : cost(cost);
    }

    protected abstract double cost(double cost);
    protected abstract double promotionalCost(double cost);

}
