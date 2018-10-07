package DZ4_Collections;

import java.util.LinkedHashSet;

interface MainCourses extends Dishes {
    String getName();

    int getPrice();

    void setAmount(int amount);

    int getAmount();

    static LinkedHashSet mainCoursesMenu() {
        LinkedHashSet<MainCourses> mainCourses = new LinkedHashSet<>();
        mainCourses.add(new CheeseSoup());
        mainCourses.add(new ShashlickCaucasian());
        mainCourses.add(new VegetablesOnGrill());
        return mainCourses;
    }
}
