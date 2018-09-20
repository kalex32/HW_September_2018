package DZ3_Collections;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

class Menu {
    void mainMenu() {
        Scanner scannerMenu = new Scanner(System.in);

        System.out.println("Выберите вендора:" + "\n" +
                "1. Toyota" + "\n" +
                "2. Procter & Gamble" + "\n" +
                "3. Electrolux" + "\n" +
                "4. Выход");
        try {
            switch (scannerMenu.nextInt()) {
                case 1:
                    System.out.println(Toyota.toyota().toString());
                    System.out.println();
                    for (Toyota i: Toyota.toyotaSortedByName()) {
                        System.out.println(i.toString());
                    }
                    break;
                case 2:
                    System.out.println(ProcterAndGamble.procterAndGamble().toString());
                    break;
                case 3:
                    System.out.println(Electrolux.electrolux().toString());
                    break;
                case 4:
                    System.exit(0);
                default:
                    mainMenu();
            }
        } catch (InputMismatchException e) {
            mainMenu();
        }
    }
}
