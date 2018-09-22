package DZ3_Collections;

import java.util.Comparator;

class SortedByName implements Comparator<Vendors> {

    @Override
    public int compare(Vendors o1, Vendors o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
