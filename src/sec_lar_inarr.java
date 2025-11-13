import java.util.*;
public class sec_lar_inarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max=0,smax=0;
        for (int i = 0; i < a.length; i++)
        {
         if(max<a[i]);
         smax=max;
         max=a[i];
        }
        System.out.println("second largest="+smax);
    }
}
