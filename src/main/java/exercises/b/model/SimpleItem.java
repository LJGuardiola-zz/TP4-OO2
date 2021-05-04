package exercises.b.model;

import java.util.List;

public class SimpleItem implements Item {

    private final int hours;

    public SimpleItem(int hours) {
        this.hours = hours;
    }

    @Override
    public int getCostInHours() {
        return hours;
    }

    @Override
    public List<Item> getItems() {
        throw new RuntimeException("Now allowed");
    }

    @Override
    public void add(Item item) {
        throw new RuntimeException("Now allowed");
    }

    @Override
    public void remove(Item item) {
        throw new RuntimeException("Now allowed");
    }

}
