package package_1;

public class RemoveVowels {

    public static String vowels(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
               {

                result = result + ch; 
            }
        }

        return result;
    }

    public static void main(String args[]) {
        String input = " i am mohan";
        System.out.println("After removing vowels: " + vowels(input));
    }
}
