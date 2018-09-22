package DZ3_Collections;

import java.util.ArrayList;
import java.util.Collections;

interface Toyota {
    String getName();

    int getPrice();

    static ArrayList<Toyota> toyotaUnSorted() {
        ArrayList<Toyota> cars = new ArrayList<>();
        cars.add(new Rav4());
        cars.add(new Corolla());
        cars.add(new Camry());
        return cars;
    }

    static ArrayList<Toyota> toyotaSortedByName() {
        ArrayList<Toyota> cars = new ArrayList<>();
        cars.add(new Rav4());
        cars.add(new Corolla());
        cars.add(new Camry());
        SortedByName sortedByName = new SortedByName();
        cars.sort(sortedByName);
        return cars;
    }

    static ArrayList<Toyota> toyotaSortedByPrice() {
        ArrayList<Toyota> cars = new ArrayList<>();
        cars.add(new Rav4());
        cars.add(new Corolla());
        cars.add(new Camry());
        SortedByPrice sortedByPrice = new SortedByPrice();
        cars.sort(sortedByPrice);
        return cars;
    }

}

