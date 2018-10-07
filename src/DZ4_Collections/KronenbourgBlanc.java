package DZ4_Collections;

class KronenbourgBlanc implements Beer{
    private String name;
    private String descriptionBeer;
    private int volume;
    private int amount;
    private int price;

    KronenbourgBlanc() {
        this.name = "Кроненбург Бланк";
        this.descriptionBeer = "премиальное пшеничное пиво с фруктовыми нотками. Содержание алкоголя 4,5%";
        this.volume = 500;
        this.amount = 0;
        this.price = 52;
    }

    @Override
    public String getName() {
        return name;
    }

    private int getVolume() {
        return volume;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    private String getDescriptionBeer() {
        return descriptionBeer;
    }

    @Override
    public String toString() {
        return "Пиво " + getName() + ", (" + getDescriptionBeer() + "), \n" +
                +getVolume() + " мл." + ", цена - " + getPrice() + " грн. \n" +
                "кол-во порций: " + getAmount();
    }
}
