package DZ2_Collections;

class MethodsAndInstrumentsOfAnalysisAndPlanning implements Skills {
    private boolean methodsAndInstrumentsOfAnalysisAndPlanning;

    MethodsAndInstrumentsOfAnalysisAndPlanning(boolean methodsAndInstrumentsOfAnalysisAndPlanning) {
        this.methodsAndInstrumentsOfAnalysisAndPlanning = methodsAndInstrumentsOfAnalysisAndPlanning;
    }

    private boolean isMethodsAndInstrumentsOfAnalysisAndPlanning() {
        return methodsAndInstrumentsOfAnalysisAndPlanning;
    }

    @Override
    public String toString() {
        String s;
        if (isMethodsAndInstrumentsOfAnalysisAndPlanning()) s = "да";
        else s = "нет";
        return "Методы и инструменты анализа и планирования, " +
                "знание: " + s + "; ";
    }
}
