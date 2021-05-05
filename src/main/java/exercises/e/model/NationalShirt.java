package exercises.e.model;

public class NationalShirt extends Product {

    public NationalShirt(double unitPrice) {
        super(unitPrice);
    }

    @Override
    protected double getTaxes(double unitPrice) {
        return unitPrice * 0.015;
    }

    @Override
    protected double getBonuses(double unitPrice) {
        return unitPrice * 0.2;
    }

    @Override
    protected double getProfit(double unitPrice) {
        return unitPrice * 0.15;
    }

}
