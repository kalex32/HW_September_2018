package DZ4_Collections;

import java.util.LinkedHashSet;

interface Burgers extends Dishes {
    String getName();

    int getPrice();

    void setAmount(int amount);

    int getAmount();

    static LinkedHashSet burgersMenu() {
        LinkedHashSet<Burgers> burgers = new LinkedHashSet<>();
        burgers.add(new BurgerAmsterdamSmall());
        burgers.add(new BurgerJackDanielsWithChickenMedium());
        burgers.add(new BurgerWithCheeseDorBlueBig());
        return burgers;
    }
}
