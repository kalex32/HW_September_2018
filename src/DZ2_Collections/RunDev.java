package DZ2_Collections;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunDev {
    public static void main(String[] args) {
        Scanner scannerRunDev = new Scanner(System.in);

        System.out.println("Название проекта:");
        String namePt = scannerRunDev.nextLine();

        System.out.println("Сколько команд в проекте?");
        try {
            int capacityPt = scannerRunDev.nextInt();
            scannerRunDev.nextLine();
            Project project = new Project(namePt, capacityPt);


            project.createTeams(capacityPt);
        } catch (InputMismatchException e) {
            System.out.println("На вопрос \"Сколько?\" введите целое число");

        }


        scannerRunDev.close();
    }
}
