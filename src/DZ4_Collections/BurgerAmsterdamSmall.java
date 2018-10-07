package DZ4_Collections;

public class BurgerAmsterdamSmall implements Burgers {
    private String name;
    private String descriptionSoup;
    private int weight;
    private int amount;
    private int price;

    BurgerAmsterdamSmall() {
        this.name = "Амстердам (small)";
        this.descriptionSoup = "котлета из сочной говядины, жаренный копченый бекон, грибы в соусе Демиглас, \n" +
                "кольца красного маринованного лука, спелые помидоры, маринованные соленые огурчики, \n" +
                "нежный сыр Моцарелла, американский соус 1000 островов";
        this.weight = 305;
        this.amount = 0;
        this.price = 198;
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
