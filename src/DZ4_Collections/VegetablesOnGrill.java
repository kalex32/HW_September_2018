package DZ4_Collections;

class VegetablesOnGrill implements MainCourses{
    private String name;
    private String descriptionSoup;
    private int weight;
    private int amount;
    private int price;

    VegetablesOnGrill() {
        this.name = "Овощи на гриле";
        this.descriptionSoup = "Перец болгарский, шампиньоны, цукини, баклажан, томаты, подаются с соусом Барбекю";
        this.weight = 275;
        this.amount = 0;
        this.price = 138;
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
        return "Гарнир " + getName() + ", (" + getDescriptionSoup() + "), \n" +
                +getWeight() + " гр." + ", цена - " + getPrice() + " грн. \n" +
                "кол-во порций: " + getAmount();
    }
}
