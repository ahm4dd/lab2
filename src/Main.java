import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void display(ArrayList<Employee> employees){
        for(Employee employee : employees){
            if(employee.getPosition().equalsIgnoreCase("Programmer"))
                System.out.println("User" + " Programmer ID: " + employee.getEmployeeId() + "\nProgrammer name: " + employee.getName()
                        + "\nProgrammer salary: " + employee.calculateSalary());

            if(employee.getPosition().equalsIgnoreCase("Manager"))
                System.out.println("User" + " Manager ID: " + employee.getEmployeeId() + "\nManager name: " + employee.getName()
                        + "\nManager salary: " + employee.calculateSalary());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<Employee>();

        while(true) {
            System.out.println("0.Exit 1.Start: ");
            int option = scanner.nextInt();
            if (option == 0)
                break;
            System.out.println("Enter position 1.Manager 2.Programmer: ");
            int position = scanner.nextInt();
            Employee employee;

            if (position == 1) {
                employee = new Manager();
                employee.input();
                employees.add(employee);
            } else if (position == 2) {
                employee = new Programmer();
                employees.add(employee);
            }
        }
        display(employees);
    }
}