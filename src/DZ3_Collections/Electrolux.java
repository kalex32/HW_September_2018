package DZ3_Collections;

import java.util.ArrayList;

interface Electrolux extends Vendors{

    String getName();

    int getPrice();

    static ArrayList<Electrolux> electroluxUnSorted() {
        ArrayList<Electrolux> typeOfProduct = new ArrayList<>();
        typeOfProduct.add(new Refrigerator());
        typeOfProduct.add(new VacuumCleaner());
        typeOfProduct.add(new WashingMachine());
        return typeOfProduct;
    }


    static ArrayList<Electrolux> electroluxSortedByName() {
        ArrayList<Electrolux> typeOfProduct = new ArrayList<>();
        typeOfProduct.add(new Refrigerator());
        typeOfProduct.add(new VacuumCleaner());
        typeOfProduct.add(new WashingMachine());
        SortedByName sortedByName = new SortedByName();
        typeOfProduct.sort(sortedByName);
        return typeOfProduct;
    }

    static ArrayList<Electrolux> electroluxSortedByPrice() {
        ArrayList<Electrolux> typeOfProduct = new ArrayList<>();
        typeOfProduct.add(new Refrigerator());
        typeOfProduct.add(new VacuumCleaner());
        typeOfProduct.add(new WashingMachine());
        SortedByPrice sortedByPrice = new SortedByPrice();
        typeOfProduct.sort(sortedByPrice);
        return typeOfProduct;
    }
}
