package Test;

import java.util.Comparator;

public class SortedByName implements Comparator<Avensis> {

    @Override
    public int compare(Avensis o1, Avensis o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
