package DZ3_Collections;

import java.util.ArrayList;
import java.util.Comparator;

class SortedByPrice/*<T>*/ implements Comparator<Toyota> {

    @Override
    public int compare(Toyota o1, Toyota o2) {
        if (o1.getPrice() == o2.getPrice()) return 0;
        if (o2.getPrice() > o2.getPrice()) return 1;
        else return -1;
    }
}
