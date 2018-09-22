package DZ3_Collections;

import java.util.Comparator;

class SortedByPrice/*<T>*/ implements Comparator<Toyota> {

    @Override
    public int compare(Toyota o1, Toyota o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
