package array_package;

public class Array_2D
{
	public static void main(String args[])
	{
		int [][] matrix=new int [3][3];
		matrix[0][0] = 8;
		matrix[0][1] = 4;
		matrix[0][2] = 3;

		matrix[1][0] = -5;
		matrix[1][1] = 6;
		matrix[1][2] = -2;

		matrix[2][0] = 7;
		matrix[2][1] = 9;
		matrix[2][2] = -8;
		
		 for(int i=0;i<matrix.length;i++)
		 {
			 for(int j=0;j<matrix[i].length;j++)
			 {
				 System.out.print(matrix[i][j]+" ");
			 }
			 System.out.println();  // move next row
		 }
	}

}
