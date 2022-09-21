import java.util.Scanner;
class tax
{
	public static void main(String args[])
	{
      try
      {
	double tax=0,it;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your income ");
	it=sc.nextDouble();
      if(it<0)
      {
         System.out.println("floting and negative values are not permited");

      }
	else if(it<=150000)
      {
		tax=0;
      }
	else if(it>=150001 && it<=300000)
      {
		tax=0.1*it;
      }
	else if(it>=300001 && it<=500000)
      {  
		tax=(0.2*it);
      }
      else
      {
		tax=(0.3*it);
      }
	System.out.println("Income tax amount is "+tax);
      }
      catch(Exception e)
      {
          System.out.println("floting values not allowed");
      }
      }
}