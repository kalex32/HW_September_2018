package DZ2_Collections;

class PracticalExperience implements Skills {
    private int practicalExperience;

    PracticalExperience(int practicalExperience) {
        this.practicalExperience = practicalExperience;
    }

    private int getPracticalExperience() {
        return practicalExperience;
    }

    @Override
    public String toString() {
        return "\n" + "Опыт практической работы, " +
                "лет: " + getPracticalExperience() + "; ";
    }
}
