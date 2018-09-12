package DZ2_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Team /*extends Developer*/ {
    String nameTeam;
    ArrayList<Developer> team = new ArrayList<>();
    Scanner scannerTeam = new Scanner(System.in);


    Team(String nameTeam, int capacityTeam) {
        this.nameTeam = nameTeam;
        this.team.ensureCapacity(capacityTeam);
    }


    private String getNameTeam() {
        return nameTeam;
    }

    private ArrayList<Developer> getTeam() {
        return team;
    }

    void addToTeam(int amountOfDevs) {
        Developer[] dev = new Developer[amountOfDevs];
        for (int i = 0; i < amountOfDevs; i++) {
            System.out.println("Введите имя:");
            dev[i] = new Developer(scannerTeam.nextLine());
            team.addAll(Arrays.asList(dev));
        }
        System.out.println(toString().replace("[", "").replace("]", ""));
    }

    @Override
    public String toString() {
        return "Название команды: " + getNameTeam() + "\n" +
                "Команда: " + "\n" +"\b"+ getTeam();
//                "} "/* + super.toString()*/;
    }
}
