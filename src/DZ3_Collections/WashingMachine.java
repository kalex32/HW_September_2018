package DZ3_Collections;

class WashingMachine implements Electrolux {

    private String name;
    private int price;

    WashingMachine() {
        this.name = "Стиральная машина";
        this.price = 7_546;
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
