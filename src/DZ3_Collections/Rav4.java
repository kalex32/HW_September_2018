package DZ3_Collections;

class Rav4 extends Toyota {
    private String name;
    private int price;

    Rav4() {
        this.name  = "Rav4";
        this.price = 632_400;
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
