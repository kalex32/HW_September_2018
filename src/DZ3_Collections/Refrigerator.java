package DZ3_Collections;

class Refrigerator implements Electrolux {

    private String name;
    private int price;

    Refrigerator() {
        this.name = "Холодильник";
        this.price = 9_832;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getName() + " Electrolux, цена - " + getPrice() + " грн.";
    }
}
