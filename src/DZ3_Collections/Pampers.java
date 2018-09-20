package DZ3_Collections;

class Pampers implements ProcterAndGamble {

    @Override
    public String toString() {
        String typeOfProduct = "подгузники";
        String tradeMark = "Pampers";
        int price = 239;
        return typeOfProduct + " " + tradeMark+", цена "+ price;
    }
}
