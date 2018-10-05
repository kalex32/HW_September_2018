package DZ4_Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

class Order {
    LinkedHashSet<Dishes> order;
    int discount;
    Order() {
        this.order = new LinkedHashSet<>();
        this.discount = 0;
    }

    void addToOrder(LinkedHashSet dishes, int i) {
        List<Dishes> dishesList = new ArrayList<>(dishes);
        order.add(dishesList.get(i));
    }

    void printOrder() {
        System.out.println("Ваш заказ:");
        int sum = 0;
        for (Dishes y : order) {
            System.out.println(y.toString());
            sum += y.getPrice();
        }
        System.out.println();
        System.out.println("Сумма Вашего заказа: " + sum + " грн.");
        System.out.println();
        discountOnOrder(sum);
    }

    void discountOnOrder(int sum) {
        if (sum > 500 && sum < 1000) {
            discount = 5;
            printDiscountOrder(sum, discount);
        } else if (sum > 1000 && sum < 1500) {
            discount = 10;
            printDiscountOrder(sum, discount);
        } else if (sum > 1500 && sum < 2000) {
            discount = 15;
            printDiscountOrder(sum, discount);
        } else {
            System.out.println("Чтобы получить скидку, надо заказать еще немного!");
            System.out.println();
        }
    }

    void printDiscountOrder(int sum, int discount) {
        System.out.println("Ваша скидка - " + discount + "%\n" +
                "Сумма Вашего заказа со скидкой - " + (sum - (sum / 100 * discount)) + " грн.");
        System.out.println();
    }
}
