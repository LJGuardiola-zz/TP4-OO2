package exercises.e.model;

public class ImportedShirt extends Product {

    public ImportedShirt(double unitPrice) {
        super(unitPrice);
    }

    @Override
    protected double getTaxes(double unitPrice) {
        return unitPrice * 0.08;
    }

    @Override
    protected double getBonuses(double unitPrice) {
        return unitPrice * 0;
    }

    @Override
    protected double getProfit(double unitPrice) {
        return unitPrice * 0.25;
    }

}
