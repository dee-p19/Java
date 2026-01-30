// write a program to print n fabonacci series

import java.util.*;
public class Fabonacci {
    public static void main (String[] args){
      Scanner sc = new Scanner(System.in);

      int fst = 0;
      int sec = 1;
      System.out.println("Enter n :");
      int n = sc.nextInt();
        System.out.printf("%d %d",fst,sec);
      for (int i=0 ; i<n-2 ; i++)
      {   int a = fst + sec;
          System.out.printf(" %d",a);
          fst = sec;
          sec = a;
      }
    }
}
