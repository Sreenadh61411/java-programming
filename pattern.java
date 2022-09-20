public class Pattern
{              
public static void main(String[] args)   
{  
int n = 8;     
for (int i = 0; i < n; i++)   
{  
int number = 1;  
System.out.printf("%" + (n - i) * 2 + "s", "");  
for (int j = 0; j <= i; j++)   
{  
System.out.printf("%4d", number);  
number = number * (i - j) / (j + 1);  
}  
System.out.println();  
}  import java.util.*;

class LCM 
{
  public static void main(String[] args) {
    int array[] = {8, 4, 2, 16};
    int lcm = array[0];
    int gcd = array[0];

    for(int i=1; i<array.length; i++){
      gcd = findGCD(array[i], lcm);
      lcm = (lcm*array[i])/gcd;
    }
    System.out.println("LCM: "+lcm);
  }
  public static int findGCD(int a, int b)
{
    if(b == 0)
      return a;

    return findGCD(b, a%b);
  }
}
}  
}