package Models;

import java.util.ArrayList;

public final class RequiredBuilderGroup {
    private final Builder builder1 = new Builder();
    private final ArrayList<String> builder1Skills = new ArrayList<>();

    private final Builder builder2 = new Builder();
    private final ArrayList<String> builder2Skills = new ArrayList<String>();

    public final BuilderGroup requiredGroup = new BuilderGroup();

    public void initRequiredBuilderGroup() {
        setBuildersSkills();
        setSkillsToBuilders();
        setBuildersToBuilderGroup();
    }

    private void setBuildersSkills() {
        builder1Skills.add("First skill");
        builder1Skills.add("Second skill");
        builder2Skills.add("Third skill");
        builder2Skills.add("Fourth skill");
    }

    private void setSkillsToBuilders() {
        builder1.setBuilderSkills(builder1Skills);
        builder2.setBuilderSkills(builder2Skills);
    }

    private void setBuildersToBuilderGroup() {
        ArrayList<Builder> builders = new ArrayList<Builder>();

        builders.add(builder1);
        builders.add(builder2);

        requiredGroup.setBuilders(builders);
        requiredGroup.setCost(70);
    }

    public ArrayList<String> getBuilderSkills() {
        ArrayList<String> builderSkills = new ArrayList<>();

        for (Builder builder : requiredGroup.getBuilders()) {
            builderSkills.addAll(builder.getBuilderSkills());
        }

        return builderSkills;
    }
}
