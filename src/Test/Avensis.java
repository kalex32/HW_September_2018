package Test;

//import DZ3_Collections.Toyota;

class Avensis {
    private String name;
    private int price;

    Avensis(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toyota " + getName() + getPrice();
    }
}
