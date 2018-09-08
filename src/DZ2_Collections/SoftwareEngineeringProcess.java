package DZ2_Collections;

class SoftwareEngineeringProcess implements Skills {
    private String levelOfSoftwareEngineeringProcess;
    static String[] levelOfSEP = {"low", "medium", "high"};


    SoftwareEngineeringProcess(String levelOfSoftwareEngineeringProcess) {
        this.levelOfSoftwareEngineeringProcess = levelOfSoftwareEngineeringProcess;
    }

    private String getLevelOfSoftwareEngineeringProcess() {
        return levelOfSoftwareEngineeringProcess;
    }

    static String levelSEP(String[] levelOfSEP, int r) {
        int i;
        for (i = 0; i < levelOfSEP.length; i++) {
            if (i == r) break;
        }
        return levelOfSEP[i];
    }

    @Override
    public String toString() {
        return "Разработка программного обеспечения, " +
                "уровень: " + getLevelOfSoftwareEngineeringProcess() + "; ";
    }
}
