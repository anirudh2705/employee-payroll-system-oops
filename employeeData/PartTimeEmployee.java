package employeeData;

public class PartTimeEmployee extends Employee{

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double d){
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = d;        
    }

    @Override
    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }
}
