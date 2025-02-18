import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String name;
    private int duration;

    public CourseType(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", duration=" + duration + " weeks" +
                '}';
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String name, int duration) {
        super(name, duration);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name, int duration) {
        super(name, duration);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String name, int duration) {
        super(name, duration);
    }
}

class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "Course {" + "courseType=" + courseType + '}';
    }
}

class University {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}

public class UniversityCourseManagement {
    public static void main(String[] args) {
        List<CourseType> courses = new ArrayList<>();
        
        courses.add(new ExamCourse("Mathematics", 12));
        courses.add(new AssignmentCourse("Software Engineering", 10));
        courses.add(new ResearchCourse("Artificial Intelligence", 16));

        System.out.println("Available Courses:");
        University.displayCourses(courses);
    }
}
