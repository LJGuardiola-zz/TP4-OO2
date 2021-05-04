package exercises.b.model;

import java.util.List;

public interface Item {
    int getCostInHours();
    List<Item> getItems();
    void add(Item item);
    void remove(Item item);
}
