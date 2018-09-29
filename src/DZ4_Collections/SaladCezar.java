package DZ4_Collections;

class SaladCezar implements Salads{
    private String nameSalad;
    private String descriptionSalad;
    private int weight;
    private int price;

    SaladCezar() {
        this.nameSalad = "Цезарь";
        this.descriptionSalad = "(курица, яйцо перепелиное, салат айсберг, томаты, сыр пармезан)";
        this.weight = 210;
        this.price = 90;
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
        return "Салат "+getNameSalad()+", ("+getDescriptionSalad()+"), \n" +
                +getWeight()+", цена - "+getPrice()+" грн.";
    }
}
