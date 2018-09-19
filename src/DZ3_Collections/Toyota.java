package DZ3_Collections;

import java.util.ArrayList;

interface Toyota {

    static ArrayList<Toyota> toyota(){
        ArrayList<Toyota> cars = new ArrayList<>();
        cars.add(new Avensis());
        cars.add(new Rav4());
        cars.add(new Camry());
        return cars;
    }

}

