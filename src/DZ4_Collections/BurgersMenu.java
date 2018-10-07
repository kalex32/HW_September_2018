package DZ4_Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

class BurgersMenu {
    static void printBurgersMenu(LinkedHashSet<Burgers> burgers) {
        List<Burgers> burgersList = new ArrayList<>(burgers);
        System.out.println("Выбираем бургер:");
        for (int i = 0; i < burgersList.size(); i++) {
            System.out.println(i + 1 + ". " + burgersList.get(i).getName());
        }


    }

    static void detailsOfBurgers(LinkedHashSet burgers, int i) {
        List<Burgers> burgersList = new ArrayList<>(burgers);
        System.out.println(burgersList.get(i).toString());
    }
}
