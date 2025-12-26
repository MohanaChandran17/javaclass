package package_2;

import java.util.ArrayList;

public class ReverseArrayList
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

        // Reverse 
        ArrayList<Integer> reversedList = new ArrayList<Integer>();

        for (int i = list.size() - 1; i >= 0; i--)
        {
            reversedList.add(list.get(i));
        }
        System.out.println("Reversed ArrayList: " + reversedList);
    }
}

