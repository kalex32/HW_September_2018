package DZ2_Collections;

class EnglishSkill implements Skills {
    private String levelOfKnowledge;
    static String[] levelEnglish = {"A1", "A2", "B1", "B2", "C1", "C2"};

    EnglishSkill(String levelOfKnowledge) {
        this.levelOfKnowledge = levelOfKnowledge;
    }

    private String getLevelOfKnowledge() {
        return levelOfKnowledge;
    }

    static String levelEng(String[] levelEnglish, int r) {
        int i;
        for (i = 0; i < levelEnglish.length; i++) {
            if (i == r) break;
        }
        return levelEnglish[i];
    }

    @Override
    public String toString() {
        return "Знание английского, " +
                "уровень: " + getLevelOfKnowledge() + "; ";
    }
}
