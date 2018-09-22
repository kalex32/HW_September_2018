package DZ3_Collections;

class Corolla implements Toyota {
    private String name;
    private int price;

    Corolla() {
        this.name = "Corolla";
        this.price = 459_270;
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
