import java.util.Scanner;

public class alternate_swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i=i+2)
        {
            a[i]=a[i]+a[i+1];
            a[i+1]=a[i]-a[i+1];
            a[i]=a[i]-a[i+1];
        }
    }
}
