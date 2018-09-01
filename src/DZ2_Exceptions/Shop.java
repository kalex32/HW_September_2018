package DZ2_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

class Shop {

    Scanner scannerShop = new Scanner(System.in);

    void toChoose() {
        for (; ; ) {
            System.out.println();
            System.out.println("Выберите пункт меню:" + "\n" +
                    "1. Клиент" + "\n" +
                    "2. Администратор" + "\n" +
                    "3. Выход");
            System.out.println();
            try {
                switch (scannerShop.nextInt()) {
                    default:
                        break;
                    case 1:
                        toChooseClient();
//                        Client client = new Client();
//                        System.out.println();
//                        System.out.println("Выберите пункт меню:" + "\n" +
//                                "1. Сделать заказ" + "\n" +
//                                "2. Оплатить" + "\n" +
//                                "3. Выход");
//                        System.out.println();
//                        switch (scannerShop.nextInt()) {
//                            case 1:
//                                client.toOrder();
//                                break;
//                            case 2:
//                                client.toPay();
//                                break;
//                            case 3:
//                                System.exit(0);
//                        }
//                        break;
                    case 2:
                        Administrator administrator = new Administrator();
                        System.out.println();
                        System.out.println("Выберите пункт меню:" + "\n" +
                                "1. Добавить товар в магазин" + "\n" +
                                "2. Зарегистрировать продажу" + "\n" +
                                "3. Добавить покупателя в черный список" + "\n" +
                                "4. Выход");
                        System.out.println();
                        switch (scannerShop.nextInt()) {
                            case 1:
                                administrator.toAddGoodsToShop();
                                break;
                            case 2:
                                administrator.toRegisterSale();
                                break;
                            case 3:
                                administrator.toAddToTheBlackList();
                                break;
                            case 4:
                                System.exit(0);
                        }
                        break;
                    case 3:
                        System.exit(0);
                }
            } catch (InputMismatchException i) {
                toChoose();
            }
        }
    }

    void toChooseClient() {
        Client client = new Client();
        for (; ; ) {
            System.out.println();
            System.out.println("Выберите пункт меню:" + "\n" +
                    "1. Сделать заказ" + "\n" +
                    "2. Оплатить" + "\n" +
                    "3. Выход");
            System.out.println();
            try {
                switch (scannerShop.nextInt()) {
                    case 1:
                        client.toOrder();
                        break;
                    case 2:
                        client.toPay();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            } catch (InputMismatchException i) {
                toChooseClient();
            }
        }
    }
}