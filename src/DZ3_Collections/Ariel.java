package DZ3_Collections;

class Ariel implements ProcterAndGamble {

    @Override
    public String toString() {
        String typeOfProduct = "стиральный порошок";
        String tradeMark = "Ariel";
        int price = 29;
        return typeOfProduct + " " + tradeMark+", цена "+ price;
    }
}