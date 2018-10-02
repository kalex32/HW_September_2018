package DZ4_Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

class Order {
    ArrayList<Dishes> order;

    Order() {
        this.order = new ArrayList<>();
    }

    void addToOrder(LinkedHashSet dishes, int i){
        List<Dishes> dishesList = new ArrayList<>(dishes);
        order.add(dishesList.get(i));
        System.out.println("Ваш заказ:");
        for (Dishes y:order) {
            System.out.println(y.toString());
        }
        System.out.println();
    }
}
