package exercises.b.model;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private final List<UserStory> userStories;

    public Project() {
        this.userStories = new ArrayList<>();
    }

    public void add(UserStory userStory) {
        userStories.add(userStory);
    }

    public void remove(UserStory userStory) {
        userStories.remove(userStory);
    }

    public int getCostInHours() {
        return userStories.stream().mapToInt(UserStory::getCostInHours).sum();
    }

}
