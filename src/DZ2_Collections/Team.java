package DZ2_Collections;

import java.util.ArrayList;
import java.util.Arrays;

class Team /*extends Developer*/ {
    private String nameTeam;
    private ArrayList<Developer> team = new ArrayList<>();


    Team(String nameTeam, int capacity) {
        this.nameTeam = nameTeam;
        this.team.ensureCapacity(capacity);
    }

    private String getNameTeam() {
        return nameTeam;
    }

    private ArrayList<Developer> getTeam() {
        return team;
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
                "Команда: " + "\n" +"\b"+ getTeam();
//                "} "/* + super.toString()*/;
    }
}
