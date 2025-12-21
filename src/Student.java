public class Student extends Human {
    private String university;
    private float gpa;

    public Student(int age, String name, boolean isStudent, String university, float gpa) {
        super(age, name, isStudent);
        this.university = university;
        this.gpa = gpa;
    }

    @Override
    public void introduce() {
        System.out.println("I'm a student of " + university);
    }

    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }

    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
