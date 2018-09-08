package DZ2_Collections;

public class ClientTechnologies implements Skills {
    private boolean clientTechnologies;

    ClientTechnologies(boolean clientTechnologies) {
        this.clientTechnologies = clientTechnologies;
    }

    private boolean isClientTechnologies() {
        return clientTechnologies;
    }

    @Override
    public String toString() {
        String s;
        if (isClientTechnologies()) s = "да";
        else s = "нет";
        return "Клиентские технологии, " +
                "знание: " + s + "; ";
    }
}
