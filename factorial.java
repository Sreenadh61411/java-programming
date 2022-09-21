import java.util.*;
public class factorial
{
     public static void main(String []args)
     {
     try
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: "+fact); 
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