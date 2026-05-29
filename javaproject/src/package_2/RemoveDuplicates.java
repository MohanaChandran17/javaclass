package package_2;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> seen = new HashSet<>();
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!seen.contains(arr[i])) {
                seen.add(arr[i]);
                arr[index++] = arr[i]; // overwrite array
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

