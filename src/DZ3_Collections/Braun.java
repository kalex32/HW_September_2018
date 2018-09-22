package DZ3_Collections;

class Braun implements ProcterAndGamble {

    private String typeOfProduct;
    private String name;
    private int price;

    Braun() {
        this.typeOfProduct = "электробритва";
        this.name = "Braun";
        this.price = 2385;
    }

    private String getTypeOfProduct() {
        return typeOfProduct;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getTypeOfProduct() + " " + getName() + ", цена " + getPrice() + " грн.";
    }
}
