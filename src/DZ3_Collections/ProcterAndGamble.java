package DZ3_Collections;

import java.util.ArrayList;

interface ProcterAndGamble extends Vendors{

    String getName();

    int getPrice();

    static ArrayList<ProcterAndGamble> procterAndGambleUnSorted() {
        ArrayList<ProcterAndGamble> tradeMarks = new ArrayList<>();
        tradeMarks.add(new Braun());
        tradeMarks.add(new Pampers());
        tradeMarks.add(new Ariel());
        return tradeMarks;
    }


    static ArrayList<ProcterAndGamble> procterAndGambleSortedByName() {
        ArrayList<ProcterAndGamble> tradeMarks = new ArrayList<>();
        tradeMarks.add(new Braun());
        tradeMarks.add(new Pampers());
        tradeMarks.add(new Ariel());
        SortedByName sortedByName = new SortedByName();
        tradeMarks.sort(sortedByName);
        return tradeMarks;
    }

    static ArrayList<ProcterAndGamble> procterAndGambleSortedByPrice() {
        ArrayList<ProcterAndGamble> tradeMarks = new ArrayList<>();
        tradeMarks.add(new Braun());
        tradeMarks.add(new Pampers());
        tradeMarks.add(new Ariel());
        SortedByPrice sortedByPrice = new SortedByPrice();
        tradeMarks.sort(sortedByPrice);
        return tradeMarks;
    }
}
