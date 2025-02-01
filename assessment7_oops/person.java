public class person {
    private String name;
    private int age;

    // Default constructor
    public person() {
    }

    // Parameterized constructor
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public person(person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    public static void main(String[] args) { 
        person person1 = new person();
        person1.setName("Alice");
        person1.setAge(30);
        System.out.println(person1);

        person person2 = new person("Bob", 25);
        System.out.println(person2);

        // Using copy constructor
        person person3 = new person(person2);
        System.out.println(person3);
    }
}
