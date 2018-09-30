package DZ4_Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

class Order {
    ArrayList<Dishes> order = new ArrayList<>();
    void addToOrder(LinkedHashSet dishes, int i){
        List<Dishes> dishesList = new ArrayList<>(dishes);
        order.add(dishesList.get(i));
    }
}
