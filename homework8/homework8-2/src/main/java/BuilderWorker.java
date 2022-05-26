import Models.Builder;
import Models.BuilderGroup;
import Models.RequiredBuilderGroup;

import java.util.ArrayList;

public class BuilderWorker {
    public boolean checkForRequiredGroup(BuilderGroup builderGroup, RequiredBuilderGroup requiredBuilderGroup) {
        return builderGroup.getBuildersSkills().equals(requiredBuilderGroup.getBuilderSkills());
    }

    public BuilderGroup createBuilderGroup1() {
        BuilderGroup builderGroup = new BuilderGroup();

        ArrayList<String> builder1Skills = new ArrayList<>();
        builder1Skills.add("First skill");
        builder1Skills.add("Second skill");

        Builder builder1 = new Builder();
        builder1.setBuilderSkills(builder1Skills);

        ArrayList<String> builder2Skills = new ArrayList<>();
        builder2Skills.add("Third skill");
        builder2Skills.add("Fourth skill");

        Builder builder2 = new Builder();
        builder2.setBuilderSkills(builder2Skills);

        ArrayList<Builder> builders = new ArrayList<>();
        builders.add(builder1);
        builders.add(builder2);

        builderGroup.setBuilders(builders);
        builderGroup.setCost(66);

        return builderGroup;
    }

    public BuilderGroup createBuilderGroup2() {
        BuilderGroup builderGroup = new BuilderGroup();

        ArrayList<String> builder1Skills = new ArrayList<>();
        builder1Skills.add("First skill");
        builder1Skills.add("Third skill");

        Builder builder1 = new Builder();
        builder1.setBuilderSkills(builder1Skills);

        ArrayList<String> builder2Skills = new ArrayList<>();
        builder2Skills.add("Second skill");
        builder2Skills.add("Fourth skill");

        Builder builder2 = new Builder();
        builder2.setBuilderSkills(builder2Skills);

        ArrayList<Builder> builders = new ArrayList<>();
        builders.add(builder1);
        builders.add(builder2);

        builderGroup.setBuilders(builders);
        builderGroup.setCost(96);

        return builderGroup;
    }

    public BuilderGroup createBuilderGroup3() {
        BuilderGroup builderGroup = new BuilderGroup();

        ArrayList<String> builder1Skills = new ArrayList<>();
        builder1Skills.add("First skill");
        builder1Skills.add("Fifth skill");

        Builder builder1 = new Builder();
        builder1.setBuilderSkills(builder1Skills);

        ArrayList<String> builder2Skills = new ArrayList<>();
        builder2Skills.add("Second skill");
        builder2Skills.add("Fourth skill");

        Builder builder2 = new Builder();
        builder2.setBuilderSkills(builder2Skills);

        ArrayList<Builder> builders = new ArrayList<>();
        builders.add(builder1);
        builders.add(builder2);

        builderGroup.setBuilders(builders);
        builderGroup.setCost(26);

        return builderGroup;
    }

    public BuilderGroup createTestBuilderGroup() {
        BuilderGroup builderGroup = new BuilderGroup();

        ArrayList<String> builder1Skills = new ArrayList<>();
        builder1Skills.add("First skill");
        builder1Skills.add("Fifth skill");

        Builder builder1 = new Builder();
        builder1.setBuilderSkills(builder1Skills);

        ArrayList<String> builder2Skills = new ArrayList<>();
        builder2Skills.add("Second skill");
        builder2Skills.add("Fourth skill");

        Builder builder2 = new Builder();
        builder2.setBuilderSkills(builder2Skills);

        ArrayList<Builder> builders = new ArrayList<>();
        builders.add(builder1);
        builders.add(builder2);

        builderGroup.setBuilders(builders);
        builderGroup.setCost(26);

        return builderGroup;
    }
}