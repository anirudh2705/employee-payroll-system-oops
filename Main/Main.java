package Main;

import employeeData.FullTimeEmployee;
import employeeData.PartTimeEmployee;
import payrollSystem.PayrollSystem;

public class Main{
    public static void main(String[] args) {
        PayrollSystem payRollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("sai", 01, 70856.23);
        PartTimeEmployee emp2 = new PartTimeEmployee("Anirudh", 02, 19, 1987.56);

        payRollSystem.addEmployee(emp1);
        payRollSystem.addEmployee(emp2);

        System.out.println("Employees Details");
        payRollSystem.displayEmployee();
    }
}