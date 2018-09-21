package DZ3_Collections;

class Camry extends Toyota {
    private String name;
    private int price;

    Camry() {
        this.name = "Camry";
        this.price = 809_500;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toyota " + getName() + " цена - " + getPrice() + " грн.";
    }
}
