package package_1;

public class Student_grades
{

	public static void main(String[] args)
	{
	
		 double avg = 83.7;   
	        int roundedAvg = (int)Math.round(avg); 

	        char grade;

	        if (roundedAvg >= 90) 
	        {
	            grade = 'A';
	        } 
	        else if (roundedAvg >= 75)
	        {
	            grade = 'B';
	        } 
	        else if (roundedAvg >= 50)
	        {
	            grade = 'C';
	        } 
	        else {
	            grade = 'D';
	        }

	        System.out.println("Average : " + avg);
	        System.out.println("Rounded Average : " + roundedAvg);
	        System.out.println("Grade: " + grade);
	    }
	
}


