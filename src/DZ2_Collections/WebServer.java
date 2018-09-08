package DZ2_Collections;

class WebServer implements Skills {
    private boolean webServer;

    WebServer(boolean webServer) {
        this.webServer = webServer;
    }

    private boolean isWebServer() {
        return webServer;
    }

    @Override
    public String toString() {
        String s;
        if (isWebServer()) s = "да";
        else s = "нет";
        return "WEB сервер, " +
                "знание: " + s + "; ";
    }
}
