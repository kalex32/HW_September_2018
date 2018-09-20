package DZ3_Collections;

class Braun implements ProcterAndGamble {

    @Override
    public String toString() {
        String typeOfProduct = "электробритва";
        String tradeMark = "Braun";
        int price = 2385;
        return typeOfProduct + " " + tradeMark+", цена "+ price;
    }
}
