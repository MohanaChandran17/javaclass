package package_2;
public class CheckDigit 
{

    public static void main(String[] args) 
    {
        String input = "A1B2C3";

        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);

            boolean isDigit = (ch >= '0' && ch <= '9');

            System.out.println(ch + " >>> " + isDigit);
        }
    }
}

