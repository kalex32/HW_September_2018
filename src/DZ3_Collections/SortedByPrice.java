package DZ3_Collections;

import java.util.Comparator;

class SortedByPrice/*<T>*/ implements Comparator<Vendors> {

    @Override
    public int compare(Vendors o1, Vendors o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
