package DZ4_Collections;

import java.util.LinkedHashSet;

interface Salads extends Dishes{

    String getName();
    int getPrice();
    void setAmount(int amount);
    int getAmount();

    static LinkedHashSet saladsMenu() {
        LinkedHashSet<Salads> salads = new LinkedHashSet<>();
        salads.add(new SaladCezar());
        salads.add(new SaladGreenWithSalmon());
        salads.add(new SaladWithTongue());
        return salads;
    }
//    String getDescriptionSalad();
//    int getWeight();
//    int getPrice();

//    @Override
//    default String toStringSalads() {
//        return "Салат "+getNameSalad()+", ("+getDescriptionSalad()+"), \n" +
//                +getWeight()+", цена - "+getPrice()+" грн.";
//    }
}
