package DZ4_Collections;

class SaladGreenWithSalmon implements Salads {
    private String nameSalad;
    private String descriptionSalad;
    private int weight;
    private int price;

    SaladGreenWithSalmon() {
        this.nameSalad = "зеленый, с лососем";
        this.descriptionSalad = "лосось с/с, томаты вяленые, свежие огурец, яйцо пашот, соус песто";
        this.weight = 250;
        this.price = 135;
    }

    @Override
    public String getNameSalad() {
        return nameSalad;
    }

    int getWeight() {
        return weight;
    }

    int getPrice() {
        return price;
    }

    String getDescriptionSalad() {
        return descriptionSalad;
    }

    @Override
    public String toString() {
        return "Салат " + getNameSalad() + ", (" + getDescriptionSalad() + "), \n" +
                +getWeight() + " гр." + ", цена - " + getPrice() + " грн.";
    }
}
