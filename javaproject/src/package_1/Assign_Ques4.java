package package_1;

class DuplicateUserException extends Exception
{
 DuplicateUserException(String message)
 {
     super(message);
 }
}

public class Assign_Ques4
{
 public static void main(String[] args)
 {

     int existingUserId = 17;  
     int newUserId = 17;       

     try
     {
         if (newUserId == existingUserId)
         {
             throw new DuplicateUserException("User already exists & DuplicateUserException");
         }
         else 
         {
             System.out.println("User registered successfully");
         }
     } 
     catch (DuplicateUserException e)
     {
         System.out.println(e.getMessage());
     }
 }
}

