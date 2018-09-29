package DZ4_Collections;

import java.util.InputMismatchException;
import java.util.Scanner;

class Menu {
    void mainMenu() {
        Scanner scannerMainMenu = new Scanner(System.in);

        System.out.println("Буквально впиться зубами в сочный мясной стейк и забыть обо всем на свете. \n" +
                "И в первую очередь – о голоде, утолить который можно только с качественно приготовленными блюдами. \n" +
                "Именно такие подают в нашем ресторане, который приглашает всех ценителей вкусной еды европейской кухни!");
        System.out.println();
        try {
            System.out.println("Выберите тип блюд: \n" +
                    "1. Салаты \n" +
                    "2. Бургеры \n" +
                    "3. Основные блюда \n" +
                    "4. Пиво ");
            switch (scannerMainMenu.nextInt()){
                case 1:
                    SaladsMenu.saladsMenu();
                    switch (scannerMainMenu.nextInt()){
                        case 1:
                            SaladsMenu.detailsOfSalads(SaladsMenu.saladsMenu(),0);

                    }
            }
        } catch (InputMismatchException e) {
        }
    }
}