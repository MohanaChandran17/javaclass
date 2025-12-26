package package_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateId
{
    public static void main(String[] args)
    {
        ArrayList<Integer> studentIds = new ArrayList<Integer>();
        studentIds.add(101);
        studentIds.add(102);
        studentIds.add(103);
        studentIds.add(102);
        studentIds.add(104);
        studentIds.add(101);

        Set<Integer> uniqueIds = new HashSet<Integer>();
        Set<Integer> duplicateIds = new HashSet<Integer>();

        for (int id : studentIds) 
        
        {
            if (!uniqueIds.add(id)) {
                duplicateIds.add(id);
            }
        }
       
        System.out.println(duplicateIds);
    }
}

