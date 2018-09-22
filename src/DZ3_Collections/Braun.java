package DZ3_Collections;

class Braun implements ProcterAndGamble {

    private String typeOfProduct;
    private String tradeMark;
    private int price;

    Braun() {
        this.typeOfProduct = "электробритва";
        this.tradeMark = "Braun";
        this.price = 2385;
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
