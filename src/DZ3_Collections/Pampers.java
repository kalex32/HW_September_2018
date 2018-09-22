package DZ3_Collections;

class Pampers implements ProcterAndGamble {

    private String typeOfProduct;
    private String tradeMark;
    private int price;

    Pampers() {
        this.typeOfProduct = "подгузники";
        this.tradeMark = "Pampers";
        this.price = 239;
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
