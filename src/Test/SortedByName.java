package Test;

import java.util.Comparator;

public class SortedByName implements Comparator<Toyota> {

    @Override
    public int compare(Toyota o1, Toyota o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
