package Test;

//import DZ3_Collections.Toyota;

class Avensis{
    private String name;

    Avensis(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Toyota " + name;
    }
}
