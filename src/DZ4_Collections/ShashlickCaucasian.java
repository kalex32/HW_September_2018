package DZ4_Collections;

class ShashlickCaucasian implements MainCourses{
    private String name;
    private String descriptionSoup;
    private int weight;
    private int amount;
    private int price;

    ShashlickCaucasian() {
        this.name = "по кавказски";
        this.descriptionSoup = "сочный, ароматный, в особом маринаде из кунжутного масла и соевого соуса, \n" +
                "подается на запеченной лодочке, с маринованным лучком, с гарниром из молодой капусты и аджичным соусом";
        this.weight = 100;
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
        return "Шашлык " + getName() + ", (" + getDescriptionSoup() + "), \n" +
                +getWeight() + " гр." + ", цена - " + getPrice() + " грн. \n" +
                "кол-во порций: " + getAmount();
    }
}
