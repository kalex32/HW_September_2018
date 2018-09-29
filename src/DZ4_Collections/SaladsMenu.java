package DZ4_Collections;

import java.util.ArrayList;

class SaladsMenu {
    static ArrayList saladsMenu() {
        ArrayList<Salads> salads = new ArrayList<>();
        salads.add(new SaladCezar());
        salads.add(new SaladGreenWithSalmon());
        salads.add(new SaladWithTongue());
        System.out.println("Выбираем салат:");
        for (int i = 0; i < salads.size(); i++) {
            System.out.println(i + 1 + ". " + salads.get(i).getNameSalad());
        }
        return salads;
    }

    static void detailsOfSalads(ArrayList salads, int i){
        System.out.println(salads.get(i).toString());
    }
}
