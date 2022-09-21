import java.util.*;
import java.io.*;
class leapyear
{
 public static void main(String args[])
{
try
{
int a,year;
Scanner sc=new Scanner(System.in);
System.out.println("enter the date :");
a=sc.nextInt();
System.out.println("enter the year");
year=sc.nextInt();
if(year%4==0&&year%100!=0)
 {
  System.out.println( year+" is aleap year");
 }
  else if(year%400==0&&year%100==0)
  {
    System.out.println(year +"is a leap year");
  }
  else
  {
    System.out.println(year+"is not a leap year");
  }
 }
catch(ArithmeticException e)
{
System.out.println(e.getMessage());
}
catch(Exception e)
{
System.out.println("invalid input due to floating value");
}
}
}
