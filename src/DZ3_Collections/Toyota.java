package DZ3_Collections;

import java.util.ArrayList;

class Toyota {

    static ArrayList<Toyota> toyota() {
        ArrayList<Toyota> cars = new ArrayList<>();
//        Toyota avensis = new Avensis();
//        Toyota rav4 = new Rav4();
//        Toyota camry = new Camry();
        cars.add(new Avensis());
        cars.add(new Rav4());
        cars.add(new Camry());
        return cars;
    }

    static ArrayList<Toyota> toyotaSortedByName() {
        ArrayList<Toyota> carsByName = new ArrayList<>();
        carsByName.add(new Avensis());
        carsByName.add(new Rav4());
        carsByName.add(new Camry());
        SortedByName sortedByName = new SortedByName();
        carsByName.sort(sortedByName);
        return carsByName;
    }

}

