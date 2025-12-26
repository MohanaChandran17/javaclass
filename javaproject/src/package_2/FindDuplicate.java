package package_2;

import java.util.ArrayList;

public class FindDuplicate
{
    public static void main(String[] args) 
    {

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(10);

       
        System.out.println("Duplicate elements:");

        for (int i = 0; i < list.size(); i++) 
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                System.out.println(i);
              
                }
            }
        }
    }


