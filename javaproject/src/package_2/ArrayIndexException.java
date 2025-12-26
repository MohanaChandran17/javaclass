package package_2;

public class ArrayIndexException
{
    public static void main(String[] args) 
    {

        int[] arr = {10, 20, 30};

        try
        {
            System.out.println(arr[3]);
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid array index access!");
        }
    }
}

