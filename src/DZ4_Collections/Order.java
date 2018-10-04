package DZ4_Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

class Order {
    LinkedHashSet<Dishes> order;

    Order() {
        this.order = new LinkedHashSet<>();
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
        System.out.println("Сумма Вашего заказа: " + sum);
        System.out.println();
    }
}
