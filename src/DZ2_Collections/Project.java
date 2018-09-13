package DZ2_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Project {
    private String nameProject;
    private ArrayList<Team> project = new ArrayList<>();
    private Scanner scannerProject = new Scanner(System.in);

    Project(String nameProject, int capacityProject) {
        this.nameProject = nameProject;
        this.project.ensureCapacity(capacityProject);
    }


    private String getNameProject() {
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
        scannerProject.close();
        project.addAll(Arrays.asList(tm));
        System.out.println(toString().replace("[", "").replace("]", ""));
    }

    @Override
    public String toString() {
        return "Название проекта: " + getNameProject() + "\n" +
                "Команды:" + "\n" + "\b" + project;
    }
}
