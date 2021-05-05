package exercises.d.model;

import java.time.Month;

public class RetiredCalculator extends Calculator {

    public RetiredCalculator(Month promotionalMonth) {
        super(promotionalMonth);
    }

    @Override
    protected double cost(double cost) {
        return cost + cost * 0.1;
    }

    @Override
    protected double promotionalCost(double cost) {
        return cost;
    }

}
