package DZ2_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class Team {
    private String nameTeam;
    ArrayList<Developer> team = new ArrayList<>();


    Team(String nameTeam, int capacity) {
        this.nameTeam = nameTeam;
        this.team.ensureCapacity(capacity);
    }

    String getNameTeam() {
        return nameTeam;
    }

    void addToTeam(Developer[] developers ){
        team.addAll(Arrays.asList(developers));
        toString();
    }

    @Override
    public String toString() {
        return "Team: " +
                "название: " + getNameTeam() + '\'' +
                ", team=" + team +
                '}';
    }
}
