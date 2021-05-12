package exercises.d.model;

import java.time.Month;

public class NotRetiredCalculator extends Calculator {

    public NotRetiredCalculator(LogTransaction logger, Month promotionalMonth) {
        super(logger, promotionalMonth);
    }

    @Override
    protected double cost(double cost) {
        return cost + cost * 0.21;
    }

    @Override
    protected double promotionalCost(double cost) {
        return cost + cost * 0.15;
    }

}
