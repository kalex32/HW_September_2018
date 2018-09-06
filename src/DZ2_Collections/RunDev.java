package DZ2_Collections;

import java.util.Scanner;

public class RunDev {
    public static void main(String[] args) {
        System.out.println("Введите имя:");
        Scanner scannerRunDev = new Scanner(System.in);

        Developer developer = new Developer(scannerRunDev.next());
        System.out.println(developer.toString());

    }
}
