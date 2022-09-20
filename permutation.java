import java.util.Scanner;
public class permutation
{   
public static void main(String args[])   
{ 
int number; 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the value of N: ");
 number = sc.nextInt();     
findPermutation(number);  
}   
{  
int temp = number, count = 0;  
while (temp > 0)   
{     
count++;  
temp = temp / 10;  
}   
int[] num = new int[count];  
while (number > 0)  
{   
num[count-- - 1] = number % 10;  
number = number / 10;  
}  
while (findsNextpermutation(num))   
{  
for (int i = 0; i < num.length; i++)   
System.out.print(num[i]);  
System.out.print("\n");  
}  
}  
static boolean findsNextpermutation(int[] p)   
{  
for (int a = p.length - 2; a >= 0; --a)  
if (p[a] < p[a + 1])  
for (int b = p.length - 1;; --b)  
if (p[b] > p[a])   
{    
int t = p[a];  
p[a] = p[b];  
p[b] = t;  
for (++a, b = p.length - 1; a < b; ++a, --b)  
{   
t = p[a];  
p[a] = p[b];  
p[b] = t;  
}  
return true;  
}  
return false;  
}  
}  