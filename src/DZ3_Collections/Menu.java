package DZ3_Collections;

import java.util.InputMismatchException;
import java.util.Scanner;

class Menu {
    void mainMenu() {
        Scanner scannerMenu = new Scanner(System.in);
        try {
            for (; ; ) {
                System.out.println("Выберите вендора:\n" +
                        "1. Toyota" + "\n" +
                        "2. Procter & Gamble" + "\n" +
                        "3. Electrolux" + "\n" +
                        "4. Выход");
                switch (scannerMenu.nextInt()) {
                    case 1:
                        System.out.println("Список товаров представить:\n" +
                                "1. В порядке добавления\n" +
                                "2. Сортированный по имени\n" +
                                "3. Сортированный по цене");
                        switch (scannerMenu.nextInt()) {
                            case 1:
                                for (Toyota i : Toyota.toyotaUnSorted()) {
                                    System.out.println(i.toString());
                                }
                                System.out.println();
                                break;
                            case 2:
                                for (Toyota i : Toyota.toyotaSortedByName()) {
                                    System.out.println(i.toString());
                                }
                                System.out.println();
                                break;
                            case 3:
                                for (Toyota i : Toyota.toyotaSortedByPrice()) {
                                    System.out.println(i.toString());
                                }
                                System.out.println();
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Список товаров представить:\n" +
                                "1. В порядке добавления\n" +
                                "2. Сортированный по имени\n" +
                                "3. Сортированный по цене");
                        switch (scannerMenu.nextInt()) {
                            case 1:
                                for (ProcterAndGamble i : ProcterAndGamble.procterAndGambleUnSorted()) {
                                    System.out.println(i.toString());
                                }
                                System.out.println();
                                break;
                            case 2:
                                for (ProcterAndGamble i : ProcterAndGamble.procterAndGambleSortedByName()) {
                                    System.out.println(i.toString());
                                }
                                System.out.println();
                                break;
                            case 3:
                                for (ProcterAndGamble i : ProcterAndGamble.procterAndGambleSortedByPrice()) {
                                    System.out.println(i.toString());
                                }
                                System.out.println();
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Список товаров представить:\n" +
                                "1. В порядке добавления\n" +
                                "2. Сортированный по имени\n" +
                                "3. Сортированный по цене");
                        switch (scannerMenu.nextInt()) {
                            case 1:
                                for (Electrolux i : Electrolux.electroluxUnSorted()) {
                                    System.out.println(i.toString());
                                }
                                System.out.println();
                                break;
                            case 2:
                                for (Electrolux i : Electrolux.electroluxSortedByName()) {
                                    System.out.println(i.toString());
                                }
                                System.out.println();
                                break;
                            case 3:
                                for (Electrolux i : Electrolux.electroluxSortedByPrice()) {
                                    System.out.println(i.toString());
                                }
                                System.out.println();
                                break;
                            default:
                                break;
                        }
                        break;
                    case 4:
                        scannerMenu.close();
                        System.exit(0);
                    default:
                        mainMenu();
                }
            }
        } catch (InputMismatchException e) {
            mainMenu();
        }
    }
}
