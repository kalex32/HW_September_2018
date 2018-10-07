package DZ4_Collections;

class BurgerWithCheeseDorBlueBig implements Burgers{
    private String name;
    private String descriptionSoup;
    private int weight;
    private int amount;
    private int price;

    BurgerWithCheeseDorBlueBig() {
        this.name = "с сыром ДорБлю (big)";
        this.descriptionSoup = "c сочной куриной котлетой, сыром Дор Блю, салатом Айсберг, свежим огурцом и помидором, \n" +
                "фирменным соусом, в хрустящей булочке с кунжутом";
        this.weight = 545;
        this.amount = 0;
        this.price = 268;
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
