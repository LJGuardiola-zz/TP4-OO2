package exercises.b.model;

import java.util.ArrayList;
import java.util.List;

public class UserStory implements Item {

    private final List<Item> items;

    public UserStory() {
        this.items = new ArrayList<>();
    }

    @Override
    public int getCostInHours() {
        return items.stream().mapToInt(Item::getCostInHours).sum();
    }

    @Override
    public List<Item> getItems() {
        return items;
    }

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public void remove(Item item) {
        item.remove(item);
    }

}
