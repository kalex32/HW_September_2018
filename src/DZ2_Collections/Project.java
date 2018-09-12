package DZ2_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Project /*extends Team*/{
    private String nameProject;
    ArrayList<Team> project = new ArrayList<>();
    Scanner scannerProject = new Scanner(System.in);

    Project(/*String nameTeam, int capacityTeam, */String nameProject, int capacityProject) {
//        super(nameTeam, capacityTeam);
        this.nameProject = nameProject;
        this.project.ensureCapacity(capacityProject);
    }

//    Project(String nameTeam, String nameProject, int capacityProject) {
//        super(nameTeam);
//        this.nameProject = nameProject;
//        this.project.ensureCapacity(capacityProject);
//    }

    String getNameProject() {
        return nameProject;
    }

    void createTeams(int capacityPt){
        Team[] tm = new Team[capacityPt];
        int amountOfDevs=0;
        for (int j = 0; j < capacityPt; j++) {
            System.out.println("Наименование команды:");
            String nameTm = scannerProject.nextLine();
            System.out.println("Команда из скольки человек?");
            amountOfDevs = scannerProject.nextInt();
            scannerProject.nextLine();
            tm[j] = new Team(nameTm, amountOfDevs);
        }
        project.addAll(Arrays.asList(tm));
        tm[0].addToTeam(amountOfDevs, capacityPt);
    }

//    @Override
//    public String toString() {
//        return "Project{" +
//                "nameProject='" + nameProject + '\'' +
//                '}';
//    }
}
