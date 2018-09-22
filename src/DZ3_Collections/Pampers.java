package DZ3_Collections;

class Pampers implements ProcterAndGamble {

    private String typeOfProduct;
    private String name;
    private int price;

    Pampers() {
        this.typeOfProduct = "подгузники";
        this.name = "Pampers";
        this.price = 239;
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
        return getTypeOfProduct() + " " + getName() + ", цена " + getPrice();
    }
}
