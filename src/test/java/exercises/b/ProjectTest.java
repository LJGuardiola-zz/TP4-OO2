package exercises.b;

import exercises.b.model.Project;
import exercises.b.model.Spike;
import exercises.b.model.Task;
import exercises.b.model.UserStory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProjectTest {

    @Test
    void get_cost_in_hours() {

        Project scrumProject = new Project();

        UserStory userStory1 = new UserStory();
        scrumProject.add(userStory1);

        Spike spike1 = new Spike(5);
        userStory1.add(spike1);

        Spike spike2 = new Spike(6);
        userStory1.add(spike2);

        Task task1 = new Task(4);
        userStory1.add(task1);
        Task task2 = new Task(5);
        userStory1.add(task2);
        Task task3 = new Task(2);
        userStory1.add(task3);

        int total = 5 + 6 + 4 + 5 + 2;

        Assertions.assertEquals(
                total, scrumProject.getCostInHours()
        );

    }

}
