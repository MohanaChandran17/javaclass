package package_2;


class InvalidTransactionException extends Exception 
{
 InvalidTransactionException(String msg) 
 {
     super(msg);
 }
}

public class Assign17_Ques1 
{
 public static void main(String[] args)
 {

     int amount = 15000; 
     int limit = 10000;   

     try {
         if (amount > limit)
         {
             throw new InvalidTransactionException("Daily limit exceeded");
         } 
         else 
         {
             System.out.println("Transaction Successful");
         }
     } 
     catch (InvalidTransactionException uu)
     {
         System.out.println(uu.getMessage());
     }
 }
}
