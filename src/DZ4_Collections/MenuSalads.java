package DZ4_Collections;

class MenuSalads {
    static void menuSalads() {
        Salads saladCezar = new SaladCezar();
        System.out.println("Выбираем салат: \n" +
                "1. " + saladCezar.getNameSalad() + "\n" /*+
                "(курица, яйцо перепелиное, салат айсберг, томаты, сыр пармезан)"*/);
    }
}
