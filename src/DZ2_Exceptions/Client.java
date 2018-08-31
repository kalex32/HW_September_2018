package DZ2_Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

class Client implements Clients{
    private String nameClient;

    {
        System.out.println("Введите имя");
    }

   private Scanner scannerClient = new Scanner(System.in);

    Client() {
        this.nameClient = scannerClient.nextLine();
    }

    public String getNameClient() {
        return nameClient;
    }

    ArrayList<Product> cart = new ArrayList<>();
    Administrator administrator = new Administrator();

    @Override
    public void toOrder() {
        for (; ; ) {
            System.out.println("Выберите, пожалуйста, товар:");
            for (Product p : administrator.products) System.out.println(p.toString());
            System.out.println();
            cart.add(administrator.products.get(scannerClient.nextInt() - 1));
            System.out.println("Ваша корзина:");
            System.out.println();
            for (Product p : cart) System.out.println(p.toString());
            System.out.println("Хотите добавить еще товар?:" + "\n" +
                    "1. Добавить" + "\n" +
                    "2. Нет");
            if (scannerClient.nextInt() != 1) break;
        }
    }

    @Override
    public void toPay() {

    }
}
