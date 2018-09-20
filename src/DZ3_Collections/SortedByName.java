package DZ3_Collections;

import java.util.Comparator;

class SortedByName implements Comparator<Toyota> {


    @Override
    public int compare(Toyota o1, Toyota o2)
    {
        return o1.getClass().getName().compareTo(o2.getClass().getName());
    }
}
