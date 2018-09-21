package DZ3_Collections;

import java.util.ArrayList;

class Toyota {
   static ArrayList<Toyota> cars = new ArrayList<>();

    Toyota() {
        cars.add(new Corolla());
        cars.add(new Rav4());
        cars.add(new Camry());
    }

    static ArrayList<Toyota> toyotaSortedByName() {
        SortedByName sortedByName = new SortedByName();
        cars.sort(sortedByName);
        return cars;
    }

}

