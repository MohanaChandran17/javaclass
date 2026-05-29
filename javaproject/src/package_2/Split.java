package package_2;
public class Split 
{

    public static void main(String[] args) 
    {
        String input = "A@B#C$D%E";
        String token = "";

        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            {
                token += ch;
            } 
            else 
            {
              
                if (!token.isEmpty()) 
                {
                    System.out.print(token + "");
                    token = "";
                }
            }
        }
        if (!token.isEmpty()) 
        {
            System.out.print(token);
        }
    }
}
