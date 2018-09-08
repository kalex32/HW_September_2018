package DZ2_Collections;

class ApplicationServer implements Skills {
    private boolean applicationServer;

    ApplicationServer(boolean applicationServer) {
        this.applicationServer = applicationServer;
    }

    private boolean isApplicationServer() {
        return applicationServer;
    }

    @Override
    public String toString() {
        String s;
        if (isApplicationServer()) s = "да";
        else s = "нет";
        return "Сервер приложений, " +
                "знание: " + s + "; ";
    }
}
