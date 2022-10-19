import java.util.Scanner;
public class patternnum 
{  
public static void main(String[] args)   
{  
int rows;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no.of rows:");
rows=sc.nextInt();    
for (int i = 1; i <= rows; i++)   
{  
for (int j = 1; j <= i; j++)   
{   
System.out.print(i+" ");   
}   
System.out.println();   
}    
for (int i = rows-1; i >= 1; i--)  
{  
for (int j = 1; j <= i; j++)  
{  
System.out.print(i+" ");  
}  
System.out.println();  
}  
}  
}  