package DZ4_Collections;

import java.util.LinkedHashSet;

interface Beer extends Dishes{
    String getName();

    int getPrice();

    void setAmount(int amount);

    int getAmount();

    static LinkedHashSet beerMenu() {
        LinkedHashSet<Beer> beer = new LinkedHashSet<>();
        beer.add(new Lvivske1715());
        beer.add(new KronenbourgBlanc());
        beer.add(new GrimbergenAmbri());
        return beer;
    }
}
