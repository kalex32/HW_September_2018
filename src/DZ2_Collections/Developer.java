package DZ2_Collections;

import java.util.ArrayList;
import java.util.Random;

class Developer {
    private String nameDeveloper;
    ArrayList<Skills> skills = new ArrayList<>();

    Developer(String nameDeveloper) {
        Random random = new Random();
        this.nameDeveloper = nameDeveloper;
        this.skills.add(new ApplicationServer(random.nextBoolean()));
        this.skills.add(new ClientTechnologies(random.nextBoolean()));
        this.skills.add(new DatabaseManagementSystem(random.nextBoolean()));
        this.skills.add(new MethodsAndInstrumentsOfAnalysisAndPlanning(random.nextBoolean()));
        this.skills.add(new ServerTechnologies(random.nextBoolean()));
        this.skills.add(new SoftwareEngineeringProcess(SoftwareEngineeringProcess.levelSEP
                (SoftwareEngineeringProcess.levelOfSEP, random.nextInt(SoftwareEngineeringProcess.levelOfSEP.length))));
        this.skills.add(new WebServer(random.nextBoolean()));
        this.skills.add(new EnglishSkill(EnglishSkill.levelEng(EnglishSkill.levelEnglish, random.nextInt
                (EnglishSkill.levelEnglish.length))));
        this.skills.add(new PracticalExperience(random.nextInt(20)));

    }


    private String getNameDeveloper() {
        return nameDeveloper;
    }


    @Override
    public String toString() {
        return "Developer: " +
                "Имя = " + getNameDeveloper() + "\n" +
                "skills: " +"\n"+
                skills.toString()+"\n"+"\b";
    }
}
