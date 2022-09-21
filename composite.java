import java.util.Scanner;
class composite
{
   int flag,n,i,j,A,B;
     public static void main(String args[])   
      {
           composite ob=new composite();
      }
   composite()
   {
    try
    {  
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter value for A: ");
       A=sc.nextInt();
       System.out.print("Enter value for B: ");
       B=sc.nextInt();
       for(i=A;i<=B;i++ )
        {
            flag=0;
           for(j=2;j<i;j++)
             {
                 if(i % j == 0)
                    flag++;
             }
           if(flag!=0)
            System.out.println("one of the composite number is:" + i);
         }
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