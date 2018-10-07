package DZ4_Collections;

public class SaladWithTongue implements Salads {
    private String name;
    private String descriptionSalad;
    private int weight;
    private int amount;
    private int price;

    SaladWithTongue() {
        this.name = "из языка с томатами и шампиньонами";
        this.descriptionSalad = "язык, томаты, шампиньоны свежие, бальзамическая заправка";
        this.weight = 210;
        this.amount = 0;
        this.price = 115;
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
