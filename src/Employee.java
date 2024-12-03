import java.util.Scanner;
abstract public class Employee {
    private String name;
    private int employeeId;
    private double salary;
    private String position;


    Employee(){
       // input();
    }
    /*Employee(int employeeId, String name, double salary){
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
    Employee(int employeeId, String name){
        this.employeeId = employeeId;
        this.name = name;
    }*/

    public double getSalary() {
        return salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    abstract public double calculateSalary();

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee ID: ");
        this.employeeId = scanner.nextInt();
        System.out.println("Enter name: ");
        this.name = scanner.next();
    }
}
