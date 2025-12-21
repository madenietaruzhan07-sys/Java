import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Is student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        Human human = new Human(age, name, isStudent);

        Employee employee = new Employee(25, "Sanzhar", false, "Software Developer", 252000.05f);

        Student student = new Student(19, "Ayana", true, "Astana IT university", 3.3f);

        human.setAge(human.getAge() + 1);

        human.introduce();
        employee.introduce();
        student.introduce();

        System.out.println(employee.getType());
        System.out.println("Company: " + Employee.companyName);
    }
}