package DZ4_Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

interface Salads{

    String getNameSalad();

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
