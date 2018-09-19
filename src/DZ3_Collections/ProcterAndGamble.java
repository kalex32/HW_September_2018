package DZ3_Collections;

import java.util.ArrayList;

interface ProcterAndGamble {
    static ArrayList<ProcterAndGamble> procterAndGamble(){
        ArrayList<ProcterAndGamble> tradeMarks = new ArrayList<>();
        tradeMarks.add(new Ariel());
        tradeMarks.add(new Braun());
        tradeMarks.add(new Pampers());
        return tradeMarks;
    }
}
