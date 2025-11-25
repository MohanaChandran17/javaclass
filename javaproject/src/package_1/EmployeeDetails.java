package package_1;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();
       

       System.out.print("Enter Employee Name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double empSalary = sc.nextDouble();
        

        System.out.print("Enter Employee Designation: ");
        String empDesignation = sc.nextLine();

        System.out.print("Enter Employee City: ");
        String empCity = sc.nextLine();

       
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID        : " + employeeId);
        System.out.println("Employee Name      : " + employeeName);
        System.out.println("Employee Salary    : " + empSalary);
        System.out.println("Employee Designation: " + empDesignation);
        System.out.println("Employee City      : " + empCity);

       
    }
}

