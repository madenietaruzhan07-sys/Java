import interfaces.ILearner;
import interfaces.IWorker;
import model.Employee;
import model.Human;
import model.Student;

public class Main {
    public static void main(String[] args) {
        Human humanRef = new Employee(25, "Sanzhar", false, "Software Developer", 300000f);
        IWorker workerRef = new Employee(30, "Saule", false, "Project Manager", 350000f);
        ILearner learnerRef = new Student(18, "Aruzhan", true, "Astana IT University", 2.9f, "250555");
        Student studentObj = new Student(19, "Nurasyl", true, "AITU", 3.2f, "250864");

        humanRef.introduce();
        System.out.println(humanRef.getType());

        workerRef.work();
        System.out.println("Salary: " + workerRef.getSalary());

        System.out.println("Company: " + Employee.COMPANY_NAME);

        learnerRef.study();
        System.out.println("GPA: " + learnerRef.getGPA());

        studentObj.printStudentId();
    }
}