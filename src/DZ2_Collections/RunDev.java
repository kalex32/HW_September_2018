package DZ2_Collections;

import java.util.Scanner;

public class RunDev {
    public static void main(String[] args) {
        Scanner scannerRunDev = new Scanner(System.in);

        System.out.println("Название проекта:");
        String namePt = scannerRunDev.nextLine();

        System.out.println("Сколько команд в проекте?");
        int capacityPt = scannerRunDev.nextInt();
        scannerRunDev.nextLine();
        Project project = new Project(namePt, capacityPt);

        project.createTeams(capacityPt);

        scannerRunDev.close();
    }
}
