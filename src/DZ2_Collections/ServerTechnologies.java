package DZ2_Collections;

class ServerTechnologies implements Skills {
    private boolean serverTechnologies;

    ServerTechnologies(boolean serverTechnologies) {
        this.serverTechnologies = serverTechnologies;
    }

    private boolean isServerTechnologies() {
        return serverTechnologies;
    }

    @Override
    public String toString() {
        String s;
        if (isServerTechnologies()) s = "да";
        else s = "нет";
        return "\n" + "Серверные технологии, " +
                "знание: " + s;
    }
}
