package DZ2_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Project /*extends Team*/ {
    private String nameProject;
    private ArrayList<Team> project = new ArrayList<>();
    private Scanner scannerProject = new Scanner(System.in);

    Project(String nameProject, int capacityProject) {
        this.nameProject = nameProject;
        this.project.ensureCapacity(capacityProject);
    }


    String getNameProject() {
        return nameProject;
    }

    void createTeams(int capacityPt) {
        Team[] tm = new Team[capacityPt];
        for (int j = 0; j < tm.length; j++) {
            System.out.println("Наименование команды:");
            String nameTm = scannerProject.nextLine();
            System.out.println("Команда из скольки человек?");
           int amountOfDevs = scannerProject.nextInt();
            scannerProject.nextLine();
            tm[j] = new Team(nameTm, amountOfDevs);
            tm[j].addToTeam(amountOfDevs);

        }
        project.addAll(Arrays.asList(tm));
    }
}
