public class Employee extends Human {
    private String job;
    private float salary;

    public static String companyName = "Smart Technologies";

    public Employee(int age, String name, boolean isStudent, String job, float salary) {
        super(age, name, isStudent);
        this.job = job;
        this.salary = salary;
    }

    @Override
    public void introduce() {
        System.out.println("I'm an employee. My job is " + job);
    }

    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
}