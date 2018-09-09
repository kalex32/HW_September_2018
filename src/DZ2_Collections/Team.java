package DZ2_Collections;

import java.util.ArrayList;
import java.util.LinkedList;

class Team {
    private String nameTeam;
    ArrayList<Developer> team = new ArrayList<>();


    Team(String nameTeam, int capacity) {
        this.nameTeam = nameTeam;
        this.team.ensureCapacity(capacity);
    }
}
