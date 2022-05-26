import Models.RequiredBuilderGroup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuilderWorkerTest {
    private RequiredBuilderGroup requiredBuilderGroup;
    private BuilderWorker builderWorker;

    @BeforeEach
    public void init() {
        requiredBuilderGroup = new RequiredBuilderGroup();
        builderWorker = new BuilderWorker();
        requiredBuilderGroup.initRequiredBuilderGroup();
    }

    @Test
    public void testCheckForRequiredGroupShouldReturnTrueIfBuilderGroupIsSuitable() {
        boolean actual = builderWorker.checkForRequiredGroup(builderWorker.createBuilderGroup1(), requiredBuilderGroup);

        assertTrue(actual);
    }

    @Test
    public void testCheckForRequiredGroupShouldReturnFalseIfBuilderGroupIsNotSuitable() {
        boolean actual = builderWorker.checkForRequiredGroup(builderWorker.createBuilderGroup2(), requiredBuilderGroup);

        assertFalse(actual);
    }
}
