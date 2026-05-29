package package_2;
import java.util.*;

public class Employee_Mapping
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] empNames = new String[n];
        String[] deptNames = new String[n];
        System.out.println("Enter employee names:");
        for (int i = 0; i < n; i++) 
        {
            empNames[i] = sc.nextLine();
        }
        System.out.println("Enter department names:");
        for (int i = 0; i < n; i++)
        {
            deptNames[i] = sc.nextLine();
        }
        
        Map<String, Set<String>> deptToEmployees = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            deptToEmployees
                .computeIfAbsent(deptNames[i], k -> new HashSet<>())
                .add(empNames[i]);
        }
        
        System.out.println("Department Employees Mapping:");
        for (Map.Entry<String, Set<String>> entry : deptToEmployees.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}


