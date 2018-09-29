package DZ4_Collections;

public class SaladWithTongue implements Salads {
    private String nameSalad;
    private String descriptionSalad;
    private int weight;
    private int price;

    SaladWithTongue() {
        this.nameSalad = "из языка с томатами и шампиньонами";
        this.descriptionSalad = "язык, томаты, шампиньоны свежие, бальзамическая заправка";
        this.weight = 210;
        this.price = 115;
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
