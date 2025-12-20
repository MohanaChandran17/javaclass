package package_1;

class InvalidSalaryException extends Exception 
{
 InvalidSalaryException(String message) 
 {
     super(message);
 }
}

public class Assign17_Ques4
{
 public static void main(String[] args) 
 {

     int salary = 12000;   
     int minimum = 20000;

     try {
         if (salary < minimum) 
         {
             throw new InvalidSalaryException("InvalidSalaryException");
         }
         else 
         {
             System.out.println("Salary is valid");
         }
     } 
     catch (InvalidSalaryException e)
     {
         System.out.println(e.getMessage());
     }
 }
}

