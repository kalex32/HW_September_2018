package DZ2_Collections;

import java.util.ArrayList;
import java.util.Scanner;

class Developer {
    private String nameDeveloper;
    ArrayList<Skills> skills = new ArrayList<>();

    Scanner scannerDeveloper = new Scanner(System.in);

    Developer(String nameDeveloper) {
        this.nameDeveloper = nameDeveloper;
//        this.skills = skills;
        System.out.println("Владеете серевром приложений?"+"\n"+
                "1 - Да"+"\n"+
                "Any key - Нет");
        if (scannerDeveloper.nextInt()==1) skills.add(new ApplicationServer(true));
    }

//    Developer(String nameDeveloper) {
//        this.nameDeveloper = nameDeveloper;
//    }

    String getNameDeveloper() {
        return nameDeveloper;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "nameDeveloper='" + nameDeveloper + '\'' +
                ", skills=" + skills +
                '}';
    }
}
