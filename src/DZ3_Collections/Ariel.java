package DZ3_Collections;

class Ariel implements ProcterAndGamble {

    private String typeOfProduct;
    private String name;
    private int price;

    Ariel() {
        this.typeOfProduct = "стиральный порошок";
        this.name = "Ariel";
        this.price = 29;
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
