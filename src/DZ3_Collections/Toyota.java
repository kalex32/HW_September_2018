package DZ3_Collections;

import java.util.ArrayList;
import java.util.Collections;

class Toyota {

    static ArrayList<Toyota> toyotaUnSorted(){
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
        Toyota rav4 = new Rav4();
        Toyota corolla = new Corolla();
        Toyota camry = new Camry();
        cars.add(rav4);
        cars.add(corolla);
        cars.add(camry);
        SortedByPrice sortedByPrice = new SortedByPrice();
        Collections.sort(cars,sortedByPrice);
        return cars;
    }

}

