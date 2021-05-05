package exercises.d.model;

import java.time.Month;
import java.util.logging.Logger;

import static java.time.LocalDate.now;

public abstract class Calculator {

    private static final Logger LOG = Logger.getLogger(Calculator.class.getName());

    private final Month promotionalMonth;

    public Calculator(Month promotionalMonth) {
        this.promotionalMonth = promotionalMonth;
    }

    public double calculate(double cost) {
        LOG.info(this.getClass().getName());
        return promotionalMonth.equals(now().getMonth())
                ? promotionalCost(cost)
                : cost(cost);
    }

    protected abstract double cost(double cost);
    protected abstract double promotionalCost(double cost);

}
