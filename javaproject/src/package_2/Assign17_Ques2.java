package package_2;

class InvalidEmailException extends Exception
{
 InvalidEmailException(String message)
 {
     super(message);
 }
}

public class Assign17_Ques2
{
 public static void main(String[] args)
 {

     String email = "mohan17gmail.com"; 

     boolean found = false;

     try {
        
         for (int i = 0; i < email.length(); i++) 
         {
             if (email.charAt(i) == '@') 
             {
                 found = true;
                 break;
             }
         }

        
         if (!found) 
         {
             throw new InvalidEmailException("Invalid Email");
         } 
         else 
         {
             System.out.println("Valid Email");
         }

     } catch (InvalidEmailException e)
     {
         System.out.println(e.getMessage());
     }
 }
}

}
