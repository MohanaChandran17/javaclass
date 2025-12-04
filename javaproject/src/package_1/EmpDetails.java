package package_1;
import java.util.Scanner;

public class EmpDetails
{
    class Employee {
        private int employee_id;
        private String employee_name;
        private double employee_salary;
        
        public int getEmployeeId() {
            return employee_id;
        }

        public void setEmployeeId(int employee_id) {
            this.employee_id = employee_id;
        }
        
        public String getEmployeeName() {
            return employee_name;
        }

        public void setEmployeeName(String employee_name) {
            this.employee_name = employee_name;
        }
        
        // formatted salary string
        public String getEmployeeSalary() {
            return "₹ " + employee_salary;
        }
        
        public void setEmployeeSalary(double employee_salary) {
            this.employee_salary = employee_salary;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        EmpDetails obj= new EmpDetails();   
        Employee emp = obj.new Employee();     
        System.out.print("Enter Employee ID: ");
        emp.setEmployeeId(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter Employee Name: ");
        emp.setEmployeeName(scan.nextLine());
        System.out.print("Enter Employee Salary: ");
        emp.setEmployeeSalary(scan.nextDouble());

         System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getEmployeeName());
        System.out.println("Salary: " + emp.getEmployeeSalary());

        
    }
}

