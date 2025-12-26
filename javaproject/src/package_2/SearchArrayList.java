package package_2;
import java.util.ArrayList;
public class SearchArrayList
{
    public static void main(String[] args)
    {

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int searchElement = 30;
        boolean found = false;

        // Search 
        for (int i = 0; i < list.size(); i++) 
        {
            if (list.get(i) == searchElement)
            {
                found = true;
                break;
            }
        }
        if (found)
        {
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }
    }
}
