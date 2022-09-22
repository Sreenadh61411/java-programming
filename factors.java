import java.util.*;
public class factors
{
public static void main(String[] args)
{
try
{
int num;
Scanner sc = new Scanner(System.in);
System.out.print("\nEnter a number : ");
num = sc.nextInt();
if(num<=0)
{
System.out.println("entre apositive integer");
}
else
{
int i, count = 0;
System.out.print("\nThe factors of " + num + " are : " );
for(i = 1; i <= num; i++)
{
if(num % i == 0)
{
count = count + 1;
System.out.print(i + " ");
}
}
System.out.print("\nTotal factors of " + num + " : " + count);
}
}
catch(ArithmeticException e)
{
System.out.print(e.getMessage());
}
catch(Exception e)
{
System.out.print("invalid input dur to floating value");
}
}
}