package DZ4_Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

class Order {
    private ArrayList<Dishes> order;
    private double sumOrderWithDiscount;
    private int discount;

    Order() {
        this.order = new ArrayList<>();
        this.discount = 0;
        this.sumOrderWithDiscount = 0;
    }

    void addToOrder(LinkedHashSet dishes, int i) {
        List<Dishes> dishesList = new ArrayList<>(dishes);
        order.add(dishesList.get(i));
        dishesList.get(i).setAmount(Menu.amountOfDishes());
    }

    void printOrder() {
        double sumOrder = 0;
        System.out.println("Ваш заказ:");
        for (Dishes y : order) {
            System.out.println(y.toString());
            sumOrder += (y.getAmount() * y.getPrice());
        }
        System.out.println();
        System.out.println("Сумма Вашего заказа: " + sumOrder + " грн.");
        System.out.println();
        discountOnOrder(sumOrder);
    }

    private void discountOnOrder(double sumOrder) {
        if (sumOrder > 500 && sumOrder < 1000) {
            discount = 5;
            printDiscountOrder(sumOrder);
        } else if (sumOrder >= 1000 && sumOrder <= 1500) {
            discount = 10;
            printDiscountOrder(sumOrder);
        } else if (sumOrder > 1500) {
            discount = 15;
            printDiscountOrder(sumOrder);
        } else {
            System.out.println("Чтобы получить скидку, надо заказать еще немного!");
            System.out.println();
        }
    }

    private void printDiscountOrder(double sumOrder) {
        sumOrderWithDiscount = sumOrder - (sumOrder / 100 * discount);
        System.out.println("Ваша скидка - " + discount + "%\n" +
                "Сумма Вашего заказа со скидкой - " + sumOrderWithDiscount + " грн.");
        System.out.println();
    }
}
