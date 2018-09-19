package DZ3_Collections;

import java.util.ArrayList;
import java.util.Arrays;

interface Toyota {
    default void agregatorToyota(){
       Avensis.createAvensis();
       Rav4.createRav4();
       Camry.createCamry();
    }

    static void toyota(Toyota... toyota) {
        ArrayList<Toyota> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(toyota));
    }
}

