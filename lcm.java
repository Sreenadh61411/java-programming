import java.util.*;

class lcm
{
  public static void main(String[] args) {
    int array[] = {16,20};
    int lcm = array[0];
    int gcd = array[0];

    for(int i=1; i<array.length; i++){
      gcd = findGCD(array[i], lcm);
      lcm = (lcm*array[i])/gcd;
    }
    System.out.println("LCM: "+lcm);
    System.out.println("GCD: "+gcd);
  }
  public static int findGCD(int a, int b)
{
    if(b == 0)
      return a;

    return findGCD(b, a%b);
  }
}