package exercises.c.model;

import java.util.ArrayList;
import java.util.List;

public class InsurancePackage implements Packageable {

    private final List<Packageable> packageables = new ArrayList<>();

    @Override
    public int getCost() {
        return packageables.stream()
                .mapToInt(Packageable::getCost).sum() * packageables.size() * 5 / 100;
    }

    @Override
    public void add(Packageable packageable) {
        packageables.add(packageable);
    }

    @Override
    public void remove(Packageable packageable) {
        packageables.remove(packageable);
    }

}
