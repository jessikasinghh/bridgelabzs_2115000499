class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + this.name + " to: " + this.grade);
        } else {
            System.out.println("Invalid Student Object");
        }
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Student Name: " + this.name);
            System.out.println("Roll Number: " + this.rollNumber);
            System.out.println("Grade: " + this.grade);
        } else {
            System.out.println("Invalid Student Object");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ally Johnson", 2115000499, 'A');
        Student student2 = new Student("Jolly Smith", 211550146, 'B');

        System.out.println("----------------------");
        student1.displayStudentDetails();
        System.out.println("----------------------");
        student2.displayStudentDetails();

        Student.displayTotalStudents();

        student1.updateGrade('A');
        student2.updateGrade('B');

        System.out.println("\nAfter Grade Updates:");
        System.out.println("----------------------");
        student1.displayStudentDetails();
        System.out.println("----------------------");
        student2.displayStudentDetails();
    }
}

