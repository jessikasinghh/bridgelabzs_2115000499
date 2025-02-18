import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String candidateName;
    private int experience;

    public JobRole(String candidateName, int experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "candidateName='" + candidateName + '\'' +
                ", experience=" + experience + " years" +
                '}';
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experience) {
        super(candidateName, experience);
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experience) {
        super(candidateName, experience);
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experience) {
        super(candidateName, experience);
    }
}

class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    @Override
    public String toString() {
        return "Resume {" + "jobRole=" + jobRole + '}';
    }
}

class ScreeningSystem {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println("Processing: " + resume);
        }
    }
}

public class AIResumeScreening {
    public static void main(String[] args) {
        List<JobRole> resumes = new ArrayList<>();
        
        resumes.add(new SoftwareEngineer("Alice", 5));
        resumes.add(new DataScientist("Bob", 3));
        resumes.add(new ProductManager("Charlie", 7));

        System.out.println("AI-Driven Resume Screening:");
        ScreeningSystem.processResumes(resumes);
    }
}
