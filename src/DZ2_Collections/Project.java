package DZ2_Collections;

import java.util.ArrayList;

class Project {
    private String nameProject;
    ArrayList<Team> project = new ArrayList<>();

    Project(String nameProject, int capacity) {
        this.nameProject = nameProject;
        this.project.ensureCapacity(capacity);
    }

    String getNameProject() {
        return nameProject;
    }

    @Override
    public String toString() {
        return "Project{" +
                "nameProject='" + nameProject + '\'' +
                '}';
    }
}
