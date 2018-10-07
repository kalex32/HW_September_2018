package DZ4_Collections;

import java.util.InputMismatchException;
import java.util.Scanner;

class Menu {
    private static Scanner scannerMainMenu = new Scanner(System.in);

    void welcome() {
        System.out.println("Буквально впиться зубами в сочный мясной стейк и забыть обо всем на свете. \n" +
                "И в первую очередь – о голоде, утолить который можно только с качественно приготовленными блюдами. \n" +
                "Именно такие подают в нашем ресторане, который приглашает всех ценителей вкусной еды европейской кухни!");
        mainMenu();
    }

    private void mainMenu() {
        Order order = new Order();

        System.out.println();
        try {
            for (; ; ) {
                System.out.println("Выберите тип блюд: \n" +
                        "1. Салаты \n" +
                        "2. Бургеры \n" +
                        "3. Основные блюда \n" +
                        "4. Пиво \n" +
                        "5. Выход");
                switch (scannerMainMenu.nextInt()) {
                    default:
                        mainMenu();
                    case 5:
                        System.exit(0);
                    case 1:
                        SaladsMenu.printSaladsMenu(Salads.saladsMenu());
                        int s = scannerMainMenu.nextInt();
                        switch (s) {
                            case 1:
                                choiceOfSalad(order, s);
                                break;
                            case 2:
                                choiceOfSalad(order, s);
                                break;
                            case 3:
                                choiceOfSalad(order, s);
                                break;
                        }
                        break;
                    case 2:
                        BurgersMenu.printBurgersMenu(Burgers.burgersMenu());
                        int b = scannerMainMenu.nextInt();
                        switch (b) {
                            case 1:
                                choiceOfBurger(order, b);
                                break;
                            case 2:
                                choiceOfBurger(order, b);
                                break;
                            case 3:
                                choiceOfBurger(order, b);
                                break;
                        }
                        break;
                    case 3:
                        MainCoursesMenu.printMainCoursesMenu(MainCourses.mainCoursesMenu());
                        int m = scannerMainMenu.nextInt();
                        switch (m) {
                            case 1:
                                choiceOfMainCourses(order, m);
                                break;
                            case 2:
                                choiceOfMainCourses(order, m);
                                break;
                            case 3:
                                choiceOfMainCourses(order, m);
                                break;
                        }
                        break;
                    case 4:
                        BeerMenu.printBeerMenu(Beer.beerMenu());
                        int p = scannerMainMenu.nextInt();
                        switch (p) {
                            case 1:
                                choiceOfBeer(order, p);
                                break;
                            case 2:
                                choiceOfBeer(order, p);
                                break;
                            case 3:
                                choiceOfBeer(order, p);
                                break;
                        }
                        break;
                }
            }
        } catch (InputMismatchException e) {
            scannerMainMenu.nextLine();
            mainMenu();
        }
    }

    private void choiceOfSalad(Order order, int s) {
        SaladsMenu.detailsOfSalads(Salads.saladsMenu(), s - 1);
        System.out.println();
        System.out.println("Берем? Y-\"Да\"/Any key - \"Нет\"");
        if (scannerMainMenu.next().equalsIgnoreCase("Y")) {
            order.addToOrder(Salads.saladsMenu(), s - 1);
        }
        System.out.println();
        System.out.println("Желаете взглянуть на Ваш заказ?  Y-\"Да\"/Any key - \"Нет\"");
        if (scannerMainMenu.next().equalsIgnoreCase("Y")) {
            order.printOrder();
        }
    }

    private void choiceOfBurger(Order order, int b) {
        BurgersMenu.detailsOfBurgers(Burgers.burgersMenu(), b - 1);
        System.out.println();
        System.out.println("Берем? Y-\"Да\"/Any key - \"Нет\"");
        if (scannerMainMenu.next().equalsIgnoreCase("Y")) {
            order.addToOrder(Burgers.burgersMenu(), b - 1);
        }
        System.out.println();
        System.out.println("Желаете взглянуть на Ваш заказ?  Y-\"Да\"/Any key - \"Нет\"");
        if (scannerMainMenu.next().equalsIgnoreCase("Y")) {
            order.printOrder();
        }
    }

    private void choiceOfMainCourses(Order order, int m) {
        MainCoursesMenu.detailsOfMainCourses(MainCourses.mainCoursesMenu(), m - 1);
        System.out.println();
        System.out.println("Берем? Y-\"Да\"/Any key - \"Нет\"");
        if (scannerMainMenu.next().equalsIgnoreCase("Y")) {
            order.addToOrder(MainCourses.mainCoursesMenu(), m - 1);
        }
        System.out.println();
        System.out.println("Желаете взглянуть на Ваш заказ?  Y-\"Да\"/Any key - \"Нет\"");
        if (scannerMainMenu.next().equalsIgnoreCase("Y")) {
            order.printOrder();
        }
    }

    private void choiceOfBeer(Order order, int p) {
        BeerMenu.detailsOfBeer(Beer.beerMenu(), p - 1);
        System.out.println();
        System.out.println("Берем? Y-\"Да\"/Any key - \"Нет\"");
        if (scannerMainMenu.next().equalsIgnoreCase("Y")) {
            order.addToOrder(Beer.beerMenu(), p - 1);
        }
        System.out.println();
        System.out.println("Желаете взглянуть на Ваш заказ?  Y-\"Да\"/Any key - \"Нет\"");
        if (scannerMainMenu.next().equalsIgnoreCase("Y")) {
            order.printOrder();
        }
    }

    static int amountOfDishes() {
        System.out.println("Сколько порций?");
        return scannerMainMenu.nextInt();
    }
}