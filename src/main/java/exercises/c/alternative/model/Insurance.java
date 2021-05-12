package exercises.c.alternative.model;

public class Insurance implements Packageable {

    private final int cost;

    public Insurance(int cost) {
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

}
