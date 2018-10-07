package DZ4_Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

class BeerMenu {

    static void printBeerMenu(LinkedHashSet<Beer> beer){
        List<Beer> beerList = new ArrayList<>(beer);
        System.out.println("Выбираем салат:");
        for (int i = 0; i < beerList.size(); i++) {
            System.out.println(i + 1 + ". " + beerList.get(i).getName());
        }


    }

    static void detailsOfBeer(LinkedHashSet beer, int i){
        List<Beer> beerList = new ArrayList<>(beer);
        System.out.println(beerList.get(i).toString());
    }
}
