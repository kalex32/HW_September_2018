package DZ4_Collections;

class GrimbergenAmbri implements Beer {
    private String name;
    private String descriptionBeer;
    private int volume;
    private int amount;
    private int price;

    GrimbergenAmbri() {
        this.name = "Гримберген Амбри";
        this.descriptionBeer = "темное бургундское пиво со сладко-горьковатым вкусом, имеет легкий карамельный привкус \n" +
                "и приятные нотки изюма и сухофруктов";
        this.volume = 500;
        this.amount = 0;
        this.price = 64;
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
