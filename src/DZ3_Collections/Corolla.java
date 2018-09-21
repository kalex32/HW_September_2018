package DZ3_Collections;

class Corolla extends Toyota {
    private String name;
    private int price;

    Corolla() {
        this.name = "Corolla";
        this.price = 459_270;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toyota " + name + " цена - " + getPrice() + " грн.";
    }
}
