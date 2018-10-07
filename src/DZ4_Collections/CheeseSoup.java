package DZ4_Collections;

class CheeseSoup implements MainCourses{
    private String name;
    private String descriptionSoup;
    private int weight;
    private int amount;
    private int price;

    CheeseSoup() {
        this.name = "Сырный";
        this.descriptionSoup = "густой сливочно-сырный суп с копченой курицей, белыми грибами и морковью";
        this.weight = 270;
        this.amount = 0;
        this.price = 118;
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
        return "Суп " + getName() + ", (" + getDescriptionSoup() + "), \n" +
                +getWeight() + " гр." + ", цена - " + getPrice() + " грн. \n" +
                "кол-во порций: " + getAmount();
    }
}
