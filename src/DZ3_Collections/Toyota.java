package DZ3_Collections;

import java.util.ArrayList;
import java.util.Arrays;

interface Toyota {

    static void toyota(Toyota... toyota) {
        ArrayList<Toyota> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(toyota));
    }
}

