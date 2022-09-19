import java.util.*;
public class votecheck
{
public static void main(String args[])
{
try
{
int age,n;
Scanner sc=new Scanner(System.in);
System.out.print("What is your age?");
age=sc.nextInt();
if(age>=18)
System.out.println("You are eligible to vote.");
else
{
n=18-age;
System.out.println("You are  eligible to vote after"+ n);
}
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

