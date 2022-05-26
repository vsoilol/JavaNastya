import Models.BuilderGroup;
import Models.RequiredBuilderGroup;

public class Main {
    private static final BuilderWorker builderWorker = new BuilderWorker();

    public static void main(String[] args) {
        RequiredBuilderGroup requiredBuilderGroup = new RequiredBuilderGroup();
        requiredBuilderGroup.initRequiredBuilderGroup();

        BuilderGroup builderGroup1 = builderWorker.createBuilderGroup1();
        BuilderGroup builderGroup2 = builderWorker.createBuilderGroup2();
        BuilderGroup builderGroup3 = builderWorker.createBuilderGroup3();

        System.out.print(UIResources.IS_BUILDER_GROUP_1_APPROACH);
        System.out.print(builderWorker.checkForRequiredGroup(builderGroup1, requiredBuilderGroup));

        System.out.print(UIResources.IS_BUILDER_GROUP_2_APPROACH);
        System.out.print(builderWorker.checkForRequiredGroup(builderGroup2, requiredBuilderGroup));

        System.out.print(UIResources.IS_BUILDER_GROUP_3_APPROACH);
        System.out.print(builderWorker.checkForRequiredGroup(builderGroup3, requiredBuilderGroup));
    }
}
