package DZ3_Collections;

import java.util.ArrayList;
import java.util.Comparator;

public class SortedByName implements Comparator<ArrayList> {


    @Override
    public int compare(Toyota o1, Toyota o2)
    {
        return o1.compareTo(o2.getName());
    }

    @Override
    public int compare(ArrayList o1, ArrayList o2) {
        return o1;
    }
}
