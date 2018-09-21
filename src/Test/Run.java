package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Run {
    public static void main(String[] args) {
        ArrayList<Avensis> avensis = new ArrayList<>();
        avensis.add(new Avensis("h", 1256));
        avensis.add(new Avensis("s", 4587));
        avensis.add(new Avensis("j", 125478));
        avensis.add(new Avensis("w", 785));
        avensis.add(new Avensis("b", 45123));
        avensis.add(new Avensis("a", 4785));
        avensis.add(new Avensis("m", 489654));

        System.out.println("Без сортировки");
        for (Avensis i:avensis){
            System.out.println(i.toString());
        }

        System.out.println();
        System.out.println("Сортировка");
        Collections.sort(avensis, new SortedByName());
        for (Avensis i:avensis){
            System.out.println(i.toString());
        }
    }
}
