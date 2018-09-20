package DZ3_Collections;

import java.util.ArrayList;

interface Electrolux {

    static ArrayList<Electrolux> electrolux() {
        ArrayList<Electrolux> typeOfProduct = new ArrayList<>();
        typeOfProduct.add(new Refrigerator());
        typeOfProduct.add(new VacuumCleaner());
        typeOfProduct.add(new WashingMachine());
        return typeOfProduct;
    }
}
