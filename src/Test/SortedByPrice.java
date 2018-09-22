package Test;

import java.util.Comparator;

public class SortedByPrice implements Comparator<Toyota> {
    @Override
    public int compare(Toyota o1, Toyota o2) {
        if (o1.getPrice() == o2.getPrice())return 0;
        if (o1.getPrice()>o2.getPrice())return 1;
        else return -1;
    }
}
