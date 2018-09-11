package DZ2_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class Team /*extends Developer*/ {
    private String nameTeam;
    ArrayList<Developer> team = new ArrayList<>();


    Team(String nameTeam, int capacity) {
        this.nameTeam = nameTeam;
        this.team.ensureCapacity(capacity);
    }

    String getNameTeam() {
        return nameTeam;
    }

    void addToTeam(Developer[] developers) {
        team.addAll(Arrays.asList(developers));
//        for (Developer i: team) {
//            System.out.println(i.toString());
//        }

        System.out.println(toString().replace("[", "").replace("]", ""));
    }

    @Override
    public String toString() {
        return "Название команды: " + getNameTeam() + "\n" +
                "Команда: " + "\n" +"\b"+ team;
//                "} "/* + super.toString()*/;
    }
}
