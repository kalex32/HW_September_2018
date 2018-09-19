package DZ3_Collections;

import java.util.Arrays;
import java.util.Scanner;

class Menu {
    void mainMenu() {
        Scanner scannerMenu = new Scanner(System.in);

        System.out.println("Выберите вендора:" + "\n" +
                "1. Toyota" + "\n" +
                "2. Procter & Gamble" + "\n" +
                "3. Electrolux");

        switch (scannerMenu.nextInt()) {
            case 1:
                System.out.println(Toyota.toyota().toString());
            case 2:
                System.out.println(ProcterAndGamble.procterAndGamble().toString());
            case 3:
                System.out.println(Electrolux.electrolux().toString());

        }
    }

}
