package DZ3_Collections;

class Avensis extends Toyota {
    private String name;

    Avensis() {
        this.name = "Avensis";
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Toyota " + name;
    }
}