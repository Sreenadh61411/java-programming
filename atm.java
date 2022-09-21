import java.util.Scanner;
public class atm
{
    public static void main(String args[])
    {
      try
      {
        int a,b,c,d,total; 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.of 2000 notes:");
        a= sc.nextInt();
        System.out.println("Enter the no.of 500 notes:");
         b= sc.nextInt();
        System.out.println("Enter the no.of 200 notes:");
        c= sc.nextInt();
        System.out.println("Enter the no.of 100 notes:");
        d= sc.nextInt();
        total=2000*a+500*b+200*c+100*d;
        System.out.println("the total amount is -"+total);
        }
       catch(ArithmeticException e)
       {
         System.out.println(e.getMessage());
        } 
       catch(Exception e)
        {
         System.out.println("Invalid due to floating point");
         }
}
}