package DZ3_Collections;

class Rav4 implements Toyota {
    private String name;
    private int price;

    Rav4() {
        this.name  = "Rav4";
        this.price = 632_400;
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
