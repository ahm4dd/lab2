import java.util.Scanner;
public class Programmer extends Employee{
    private String role;
    private int hoursWorked;
    private int bonus;


    Programmer(){
        super.input();
        setPosition("Programmer");
    }
    /*Programmer(int employeeId, String name){
        super(employeeId, name);
        setPosition("Programmer");
    }
    Programmer(int employeeId, String name, int hoursWorked){
        super(employeeId, name);
        this.hoursWorked = hoursWorked;
        setPosition("Programmer");
    }*/

    public String getRole() {
        return role;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hours worked if available: ");
        this.hoursWorked = scanner.nextInt();
    }

    @Override
    public double calculateSalary() {
        setSalary(getHoursWorked() * 6);
        if(bonus > 0)
            setSalary((getSalary() * bonus) / 100);
        return getSalary();
    }
}
