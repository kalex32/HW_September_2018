package DZ3_Collections;

import java.util.ArrayList;

class Toyota {

    static ArrayList<Toyota> toyota() {
        ArrayList<Toyota> cars = new ArrayList<>();
        Toyota avensis = new Avensis();
        Toyota rav4 = new Rav4();
        Toyota camry = new Camry();
        cars.add(avensis);
        cars.add(rav4);
        cars.add(camry);
        return cars;
    }

}

