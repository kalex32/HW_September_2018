package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Run {
    public static void main(String[] args) {
        ArrayList<Avensis> avensis = new ArrayList<>();
        avensis.add(new Avensis("h"));
        avensis.add(new Avensis("s"));
        avensis.add(new Avensis("j"));
        avensis.add(new Avensis("w"));
        avensis.add(new Avensis("b"));
        avensis.add(new Avensis("a"));
        avensis.add(new Avensis("m"));

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
