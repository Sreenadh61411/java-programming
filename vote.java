import java.util.*;
public class vote
{
public static void main(String[] args)
{
checkEligibility();
}
static void checkEligibility(){
int age;
Scanner sc=new Scanner(System.in);
System.out.print("What is your age?");
age=sc.nextInt();
if(age>=18)
System.out.println("You are eligible to vote.");
else
System.out.println("You are not eligible to vote.");
}
}