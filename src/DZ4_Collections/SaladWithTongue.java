package DZ4_Collections;

public class SaladWithTongue implements Salads {
    private String name;
    private String descriptionSalad;
    private int weight;
    private int price;

    SaladWithTongue() {
        this.name = "из языка с томатами и шампиньонами";
        this.descriptionSalad = "язык, томаты, шампиньоны свежие, бальзамическая заправка";
        this.weight = 210;
        this.price = 115;
    }

    @Override
    public String getName() {
        return name;
    }

    int getWeight() {
        return weight;
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
                +getWeight() + " гр." + ", цена - " + getPrice() + " грн.";
    }
}