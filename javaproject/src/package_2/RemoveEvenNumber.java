package package_2;
import java.util.ArrayList;

public class RemoveEvenNumber
{
    public static void main(String[] args)
    {

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);

        for (int i = 0; i < list.size(); i++)
        
        {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--; 
            }
        }
        System.out.println(list);
    }
}

