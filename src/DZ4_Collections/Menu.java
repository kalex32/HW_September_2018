package DZ4_Collections;

import java.util.InputMismatchException;
import java.util.Scanner;

class Menu {
    private Scanner scannerMainMenu = new Scanner(System.in);

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
                        int h = scannerMainMenu.nextInt();
                        switch (h) {
                            case 1:
                                choiceOfSalad(order, h);
                                break;
                            case 2:
                                choiceOfSalad(order, h);
                                break;
                            case 3:
                                choiceOfSalad(order, h);
                                break;
                        }
                }
            }
        } catch (InputMismatchException e) {
        }
    }

    private void choiceOfSalad(Order order, int h){
        SaladsMenu.detailsOfSalads(Salads.saladsMenu(), h - 1);
        System.out.println();
        System.out.println("Берем? Y-\"Да\"/Any key - \"Нет\"");
        if (scannerMainMenu.next().equalsIgnoreCase("Y")) {
            order.addToOrder(Salads.saladsMenu(), h - 1);
        }
        System.out.println();
        System.out.println("Желаете взглянуть на Ваш заказ?  Y-\"Да\"/Any key - \"Нет\"");
        if (scannerMainMenu.next().equalsIgnoreCase("Y")) {
            order.printOrder();
        }
    }
}