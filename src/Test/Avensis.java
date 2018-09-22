package Test;

//import DZ3_Collections.Toyota;

class Avensis implements Toyota{
    private String name;
    private int price;

    Avensis(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toyota " + getName() + getPrice();
    }
}
