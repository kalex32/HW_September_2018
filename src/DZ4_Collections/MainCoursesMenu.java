package DZ4_Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

class MainCoursesMenu {
    static void printMainCoursesMenu(LinkedHashSet<MainCourses> mainCourses) {
        List<MainCourses> mainCoursesList = new ArrayList<>(mainCourses);
        System.out.println("Выбираем основное блюдо:");
        for (int i = 0; i < mainCoursesList.size(); i++) {
            System.out.println(i + 1 + ". " + mainCoursesList.get(i).getName());
        }


    }

    static void detailsOfMainCourses(LinkedHashSet mainCourses, int i) {
        List<MainCourses> mainCoursesList = new ArrayList<>(mainCourses);
        System.out.println(mainCoursesList.get(i).toString());
    }
}
