package exercises.e.model;

public abstract class Product {

    private final double unitPrice;

    protected Product(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getFinalCost() {
        double cost = unitPrice;
        cost += getTaxes(unitPrice);
        cost -= getBonuses(cost);
        return cost + getProfit(cost);
    }

    protected abstract double getTaxes(double unitPrice);

    protected abstract double getBonuses(double unitPrice);

    protected abstract double getProfit(double unitPrice);

}
