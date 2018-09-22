package DZ3_Collections;

class VacuumCleaner implements Electrolux {

    private String name;
    private int price;

    VacuumCleaner() {
        this.name = "Пылесос";
        this.price = 2_327;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getName() + " Electrolux, цена - " + getPrice() + " грн.";
    }
}
