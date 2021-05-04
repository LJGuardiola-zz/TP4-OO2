package exercises.c.model;

public class Insurance implements Packageable {

    private final int cost;

    public Insurance(int cost) {
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void add(Packageable packageable) {
        throw new RuntimeException("Not allowed");
    }

    @Override
    public void remove(Packageable packageable) {
        throw new RuntimeException("Not allowed");
    }

}
