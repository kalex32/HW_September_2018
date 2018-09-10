package DZ2_Collections;

import java.util.Scanner;

public class RunDev {
    public static void main(String[] args) {
        Scanner scannerRunDev = new Scanner(System.in);

        System.out.println("Наименование команды:");
        String name = scannerRunDev.nextLine();

        System.out.println("Команда из скольки человек?");
        int capacity = scannerRunDev.nextInt();
        Team team = new Team(name, capacity);

        Developer[] dev = new Developer[capacity];
        for (int i = 0; i < capacity; i++) {
            System.out.println("Введите имя:");
            dev[i] = new Developer(scannerRunDev.nextLine());
        }
        team.addToTeam(dev);



//        Developer developer1 = new Developer(scannerRunDev.next(), true, true,
//                false,true, true,
//                false,true,true,2);

//        System.out.println(developer2.toString());

    }
}
