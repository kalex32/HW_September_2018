package DZ4_Collections;

import java.util.*;

class SaladsMenu {

    static void printSaladsMenu(LinkedHashSet<Salads> salads){
        List<Salads> saladsList = new ArrayList<>(salads);
        System.out.println("Выбираем салат:");
        for (int i = 0; i < saladsList.size(); i++) {
            System.out.println(i + 1 + ". " + saladsList.get(i).getNameSalad());
        }


    }

    static void detailsOfSalads(LinkedHashSet salads, int i){
        List<Salads> saladsList = new ArrayList<>(salads);
        System.out.println(saladsList.get(i).toString());
    }
}
