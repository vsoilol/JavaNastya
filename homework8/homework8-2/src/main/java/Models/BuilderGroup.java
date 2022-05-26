package Models;

import java.util.ArrayList;

public class BuilderGroup {
    private ArrayList<Builder> builders;
    private int cost;

    public ArrayList<Builder> getBuilders() {
        return builders;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setBuilders(ArrayList<Builder> builders) {
        this.builders = builders;
    }

    public ArrayList<String> getBuildersSkills() {
        ArrayList<String> builderSkills = new ArrayList<>();

        for (Builder builder : builders) {
            builderSkills.addAll(builder.getBuilderSkills());
        }

        return builderSkills;
    }
}
