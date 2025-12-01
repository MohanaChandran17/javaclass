package package_1;

import java.util.Scanner;

public class EmoloyeeDetails {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer after nextInt()
        
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        System.out.println("\n--- Employee Details ---");
        System.out.println("ID       : " + id);
        System.out.println("Name     : " + name);
        System.out.println("Salary   : " + salary);
    }
}

