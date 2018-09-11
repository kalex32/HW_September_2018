package DZ2_Collections;

import java.util.Arrays;
import java.util.Scanner;

public class RunDev {
    public static void main(String[] args) {
        Scanner scannerRunDev = new Scanner(System.in);

        System.out.println("Название проекта:");
        String namePt = scannerRunDev.nextLine();

        System.out.println("Сколько команд в проекте?");
        int capacityPt = scannerRunDev.nextInt();
        scannerRunDev.nextLine();

        System.out.println("Наименование команды:");
        String nameTm = scannerRunDev.nextLine();

        System.out.println("Команда из скольки человек?");
        int capacityTm = scannerRunDev.nextInt();
        scannerRunDev.nextLine();
        Team team = new Team(nameTm, capacityTm);

        Developer[] dev = new Developer[capacityTm];
        for (int i = 0; i < capacityTm; i++) {
            System.out.println("Введите имя:");
//            String z = scannerRunDev.nextLine();
            dev[i] = new Developer(scannerRunDev.nextLine());
        }
//        System.out.println(Arrays.toString(dev));
        team.addToTeam(dev);
        scannerRunDev.close();



//        Developer developer1 = new Developer(scannerRunDev.next(), true, true,
//                false,true, true,
//                false,true,true,2);

//        System.out.println(developer2.toString());

    }
}
