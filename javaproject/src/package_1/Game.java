package package_1;

import java.util.*;
class Game 
{
    static Scanner scan=new Scanner(System.in); 

    static String s="Are you ready";
    static String ob="[RULES]if you find the  correct number in first attempt you got first prize";
    static int a=(int)(Math.random()*10)+10;
    public static void main(String[] args)
    {
        int c=0;
        System.out.println(s);
        System.out.println(ob);
        int user_choice=0;
        while(user_choice!=a){
            c++;
            //System.out.println(a);
        System.out.print("ENTER THE CORRECT NUMBER(1to100): ");
         user_choice=scan.nextInt();
        if(user_choice<a){
            System.out.println("\t\t\tplease enter the greater number: ");
        }
        else if(user_choice>a){
            System.out.println("\t\t\tplease enter the smaller number: ");
        }
        else{
            System.out.println("\t\t\tconguratulations you are guessed correct number");
        }
    }
    if(c==1){
        System.out.println("\t\t\tyou got 1'st prize");
    }
    else if(c>1&&c<=5){
        System.out.println("\t\t\tyou got 2'nd prize");
    }
    else{
        System.out.println("\t\t\tIts okay,Better than luck next time");
    }
    }
}