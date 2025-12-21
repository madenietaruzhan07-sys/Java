public class Human {
    private int age;
    private String name;
    private boolean isStudent;

    public Human(int age, String name, boolean isStudent) {
        this.age = age;
        this.name = name;
        this.isStudent = isStudent;
    }
    public String getType() {
        return "I'm a human";
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name);
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isStudent() {
        return isStudent;
    }
    public void setStudent(boolean student) {
        isStudent = student;
    }
}