import java.util.Scanner;
import java.io.*;
public class fibnocci {
   public static void main(String[] args){
      int n, i, sum;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of N: ");
      n = sc.nextInt();
      int fabonacci[] = new int[2 *n+ 1];
      fabonacci[0] = 0;
      fabonacci[1] = 1;
      sum = 0;
      for (i = 2; i <= 2 *n; i++) {
         fabonacci[i] = fabonacci[i - 1] + fabonacci[i - 2];
         if (i % 2 == 0)
            sum += fabonacci[i];
      }
      System.out.printf("Even sum of fibonacci series till number %d is %d",n, sum);
   }
}