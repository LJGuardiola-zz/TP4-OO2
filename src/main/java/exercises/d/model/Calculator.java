package exercises.d.model;

import java.time.Month;
import java.util.logging.Logger;

import static java.time.LocalDate.now;

public abstract class Calculator {

    private final LogTransaction logger;
    private final Month promotionalMonth;

    public Calculator(LogTransaction logger, Month promotionalMonth) {
        this.logger = logger;
        this.promotionalMonth = promotionalMonth;
    }

    public double calculate(double cost) {
        logger.log(this.getClass().getName());
        return promotionalMonth.equals(now().getMonth())
                ? promotionalCost(cost)
                : cost(cost);
    }

    protected abstract double cost(double cost);
    protected abstract double promotionalCost(double cost);

}
