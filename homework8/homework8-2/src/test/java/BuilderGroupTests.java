import Models.Builder;
import Models.BuilderGroup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderGroupTests {
    private BuilderGroup builderGroup;

    @BeforeEach
    public void init() {
        BuilderWorker builderWorker = new BuilderWorker();
        builderGroup = builderWorker.createTestBuilderGroup();
    }

    @Test
    public void testSetCostShouldSetNewCost() {
        int newCost = 100;

        builderGroup.setCost(newCost);
        int actual = builderGroup.getCost();

        assertEquals(newCost, actual);
    }

    @Test
    public void testSetBuildersShouldSetNewBuilders() {
        ArrayList<Builder> newBuilders = new ArrayList<>();

        builderGroup.setBuilders(newBuilders);
        ArrayList<Builder> actual = builderGroup.getBuilders();

        assertEquals(0, actual.size());
        assertEquals(newBuilders, actual);
    }

    @Test
    public void testGetBuildersSkillsShouldReturnBuildersSkills() {
        ArrayList<String> expected = new ArrayList<String>() {{
            add("First skill");
            add("Fifth skill");
            add("Second skill");
            add("Fourth skill");
        }};

        ArrayList<String> actual = builderGroup.getBuildersSkills();

        assertEquals(expected, actual);
    }
}
