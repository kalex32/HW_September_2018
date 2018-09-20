package DZ3_Collections;

class Camry extends Toyota {
    private String name = "Camry";

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Toyota " + name;
    }
}
