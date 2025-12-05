package package_1;

class PersonP
{
    String name;
    int age;

    PersonP(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
}

class Employeeee extends PersonP
{
    int empId;
    double salary;

    Employeeee(String name, int age, int empId, double salary) 
    {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }
}

class Managerm extends Employeeee
{
    String department;

    Managerm(String name, int age, int empId, double salary, String department) 
    {
        super(name, age, empId, salary); 
        this.department = department;
    }

    void displayDetails()
    {
        System.out.println("Manager Details");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary     : Rs." + salary);
        System.out.println("Department : " + department);
    }
}

public class Question5
{
    public static void main(String[] args)
    {
        Managerm obj1 = new Managerm("Rahul", 35, 101, 75000, "IT");
        obj1.displayDetails();
    }
}

