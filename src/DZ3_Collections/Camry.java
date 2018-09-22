package DZ3_Collections;

class Camry implements Toyota {
    private String name;
    private int price;

    Camry() {
        this.name = "Camry";
        this.price = 809_500;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toyota " + getName() + " цена - " + getPrice() + " грн.";
    }
}
