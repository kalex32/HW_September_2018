package DZ3_Collections;

class Rav4 extends Toyota {
    private String name = "Rav4";

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Toyota " + name;
    }
}
