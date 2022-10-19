import java.util.Scanner;
public class digitcount
{
   public static void main(String args[])
{
try
{
      Scanner sc = new Scanner(System.in);
      int count = 0;
      System.out.println("Enter a number ::");
      int num = sc.nextInt();
      while(num!=0)
{
         num = num/10;
         count++;
}
      System.out.println("Number of digits in the entered integer are :: "+count);
}
catch(ArithmeticException e)
{
System.out.println(e.getMessage());
}
catch(Exception e)
{
System.out.println("due to special charcter");
}
   }
}