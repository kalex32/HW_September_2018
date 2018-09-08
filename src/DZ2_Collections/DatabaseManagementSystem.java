package DZ2_Collections;

class DatabaseManagementSystem implements Skills {
    private boolean databaseManagementSystem;

    DatabaseManagementSystem(boolean databaseManagementSystem) {
        this.databaseManagementSystem = databaseManagementSystem;
    }

    private boolean isDatabaseManagementSystem() {
        return databaseManagementSystem;
    }

    @Override
    public String toString() {
        String s;
        if (isDatabaseManagementSystem()) s = "да";
        else s = "нет";
        return "\n" + "Система управления базами данных, " +
                "знание: " + s + "; ";
    }
}
