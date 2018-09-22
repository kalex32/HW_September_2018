package DZ3_Collections;

class Ariel implements ProcterAndGamble {

    private String typeOfProduct;
    private String tradeMark;
    private int price;

    Ariel() {
        this.typeOfProduct = "стиральный порошок";
        this.tradeMark = "Ariel";
        this.price = 29;
    }

    private String getTypeOfProduct() {
        return typeOfProduct;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getTypeOfProduct() + " " + getTradeMark() + ", цена " + getPrice();
    }
}
