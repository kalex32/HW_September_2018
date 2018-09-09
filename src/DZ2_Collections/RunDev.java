package DZ2_Collections;

import java.util.Scanner;

public class RunDev {
    public static void main(String[] args) {
        Scanner scannerRunDev = new Scanner(System.in);
        System.out.println("Наименование команды:");
        String name = scannerRunDev.nextLine();
        System.out.println("Команда из скольки человек?");
        int capacity = scannerRunDev.nextInt();
        Team team = new Team(name,capacity);
        System.out.println("Введите имя:");

//        Developer developer1 = new Developer(scannerRunDev.next(), true, true,
//                false,true, true,
//                false,true,true,2);

        Developer developer2=new Developer(scannerRunDev.next());
        System.out.println(developer2.toString());

    }
}
