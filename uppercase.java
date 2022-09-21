import java.util.*;
class readstring
{
   public static void main(String args[])
   {
     int upper=0;
     int lower=0;
     int number=0;
     int special=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a string (* to quit)");
     String str = sc.nextLine();
     for(int i =0; i<str.length();i++)
     {
        char ch = str.charAt(i);
        if(ch>='A' && ch>='z')
        {
           upper=upper+1;
        }
        else if(ch>='a' && ch<='z')
        {
           lower=lower+1;
        }
        else if(ch>='0' && ch<='9')
        {
            number=number+1;
        }
        else
        {
             special=special+1;
        }
    }
    System.out.println("upper case" + upper);
    System.out.println("lower case" + lower);
    System.out.println("numbers" + number);
}
}