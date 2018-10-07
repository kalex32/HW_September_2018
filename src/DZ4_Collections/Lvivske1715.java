package DZ4_Collections;

class Lvivske1715 implements Beer{
    private String name;
    private String descriptionBeer;
    private int volume;
    private int amount;
    private int price;

    Lvivske1715() {
        this.name = "Львівське 1715";
        this.descriptionBeer = "старейшее светлое пиво, которое варили монахи еще в 1715 году. Легкий хмельной напиток \n"+
        "с чистым солодовым ароматом и неповторимым вкусом";
        this.volume = 500;
        this.amount = 0;
        this.price = 42;
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
