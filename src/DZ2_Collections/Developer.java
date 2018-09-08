package DZ2_Collections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Developer {
    private String nameDeveloper;
    ArrayList<Skills> skills = new ArrayList<>();

    //Scanner scannerDeveloper = new Scanner(System.in);

    Developer(String nameDeveloper) //, ApplicationServer applicationServer, ClientTechnologies clientTechnologies,
//              DatabaseManagementSystem databaseManagementSystem,
//              MethodsAndInstrumentsOfAnalysisAndPlanning methodsAndInstrumentsOfAnalysisAndPlanning,
//              ServerTechnologies serverTechnologies, SoftwareEngineeringProcess softwareEngineeringProcess,
//              WebServer webServer, EnglishSkill englishSkill, PracticalExperience practicalExperience)
 {
     Random random = new Random();
        this.nameDeveloper = nameDeveloper;
        this.skills.add(new ApplicationServer(random.nextBoolean()));
        this.skills.add(new ClientTechnologies(random.nextBoolean()));
        this.skills.add(new DatabaseManagementSystem(random.nextBoolean()));
        this.skills.add(new MethodsAndInstrumentsOfAnalysisAndPlanning(random.nextBoolean()));
        this.skills.add(new ServerTechnologies(random.nextBoolean()));
        this.skills.add(new SoftwareEngineeringProcess(SoftwareEngineeringProcess.levelSEP
                (SoftwareEngineeringProcess.levelOfSEP,random.nextInt(SoftwareEngineeringProcess.levelOfSEP.length))));
        this.skills.add(new WebServer(random.nextBoolean()));
        this.skills.add(new EnglishSkill(EnglishSkill.levelEng(EnglishSkill.levelEnglish, random.nextInt
                (EnglishSkill.levelEnglish.length))));
        this.skills.add(new PracticalExperience(random.nextInt(20)));
//        this.skills = skills;
//        System.out.println("Владеете серевром приложений?"+"\n"+
//                "1 - Да"+"\n"+
//                "Any key - Нет");
//        if (scannerDeveloper.nextInt()==1) skills.add(new ApplicationServer(true));
    }

//    public Developer(String next, boolean b, boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean b6,
//                     boolean b7, int i) {
//    }

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
