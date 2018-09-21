package Test;

import java.util.Comparator;

public class SortedByPrice implements Comparator<Avensis> {
    @Override
    public int compare(Avensis o1, Avensis o2) {
        if (o1.getPrice() == o2.getPrice())return 0;
        if (o1.getPrice()>o2.getPrice())return 1;
        else return -1;
    }
}
