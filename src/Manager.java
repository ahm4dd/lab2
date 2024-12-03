import java.util.Scanner;
public class Manager extends Employee{
    private String department;
    private boolean isTargetAchieved;


    Manager(){
       // super();

        setPosition("Manager");
    }
    /*Manager(int emlpoyeeId, String name, double salary){
        super(emlpoyeeId,name,salary);
        setPosition("Manager");
    }*/

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean getIsTargetAchieved() {
        return isTargetAchieved;
    }

    public void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salary: ");
        super.setSalary(scanner.nextDouble());
    }

    public void setTargetAchieved(boolean targetAchieved) {
        isTargetAchieved = targetAchieved;
    }

    @Override
    public double calculateSalary() {
        setSalary(getSalary() * 12);
        if(getIsTargetAchieved()) {
            System.out.println("You have a bonus for achieving the target for this year, You'll have a trip to Bali next month.");
            return getSalary();
        }
        else
            return getSalary();
    }
}
