package DZ4_Collections;

class SaladGreenWithSalmon implements Salads {
    private String name;
    private String descriptionSalad;
    private int weight;
    private int amount;
    private int price;

    SaladGreenWithSalmon() {
        this.name = "зеленый, с лососем";
        this.descriptionSalad = "лосось с/с, томаты вяленые, свежие огурец, яйцо пашот, соус песто";
        this.weight = 250;
        this.amount = 0;
        this.price = 135;
    }

    @Override
    public String getName() {
        return name;
    }

    int getWeight() {
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

    String getDescriptionSalad() {
        return descriptionSalad;
    }

    @Override
    public String toString() {
        return "Салат " + getName() + ", (" + getDescriptionSalad() + "), \n" +
                +getWeight() + " гр." + ", цена - " + getPrice() + " грн. \n" +
                "кол-во порций: " + getAmount();
    }
}
