package DZ4_Collections;

class BurgerJackDanielsWithChickenMedium implements Burgers{
    private String name;
    private String descriptionSoup;
    private int weight;
    private int amount;
    private int price;

    BurgerJackDanielsWithChickenMedium() {
        this.name = "Джек Дениелс с цыпленком (small)";
        this.descriptionSoup = "котлета из цыпленка, с помидором, листом салата Айсберг, карамелизированным луком, \n" +
                "соленым огурчиком и соусом Джек Дэниэлс";
        this.weight = 340;
        this.amount = 0;
        this.price = 168;
    }

    @Override
    public String getName() {
        return name;
    }

    private int getWeight() {
        return weight;
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

    private String getDescriptionSoup() {
        return descriptionSoup;
    }

    @Override
    public String toString() {
        return "Бургер " + getName() + ", (" + getDescriptionSoup() + "), \n" +
                +getWeight() + " гр." + ", цена - " + getPrice() + " грн. \n" +
                "кол-во штук: " + getAmount();
    }
}
