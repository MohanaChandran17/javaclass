package package_1;

class Person 
{
    String name;
    int age;

    Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person
{
    int empId;
    double salary;

    Employee(String name, int age, int empId, double salary) 
    {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }
}

class Manager extends Employee
{
    String department;

    Manager(String name, int age, int empId, double salary, String department) 
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

public class MultiLevel_Question5
{
    public static void main(String[] args)
    {
        Manager obj1 = new Manager("Rahul", 35, 101, 75000, "IT");
        obj1.displayDetails();
    }
}
