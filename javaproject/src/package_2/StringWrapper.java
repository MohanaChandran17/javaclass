package package_2;
public class StringWrapper
{

    public static void main(String[] args)
    {
        String input = "1234";

        int result = 0;

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            result = result * 10 + (ch - '0');
        }

        Integer value = result;

        System.out.println("Integer value: " + value);
    }
}
