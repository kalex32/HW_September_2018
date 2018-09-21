package DZ3_Collections;

import java.util.ArrayList;
import java.util.Comparator;

class SortedByPrice<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int price1 = o1.getClass().
        int price2 = o2.getClass().getModifiers();
        if (price1 == price2) return 0;
        if (price1 > price2) return 1;
        else return -1;
    }
}
