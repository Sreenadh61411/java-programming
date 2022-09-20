import java.util.*;
public class skipping
{ 
	public static void main(String[] args) {
         try
           {
		Scanner sc=new Scanner(System.in);
		System.out.println("M=");
		int m=sc.nextInt();
		System.out.println("N=");
		int n=sc.nextInt();
		System.out.println("K=");
		int k=sc.nextInt();
    if(m<=0 || n<=0 || k<=0)
       {
         System.out.println("invalid input");
        }
    else if(m<=n || k>=n || n<=m)
         {
        System.out.println("invalid input");
          }
		while(m<=n)
		{
		    System.out.println(m);
		    m=m+k+1;
		}
  }
           catch (Exception e){
           System.out.println("invalid input");
	}
}
}