import java.util.*;
public class reverse_sent {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.nextLine();
        int i;
        String [] b=a.split(" ");
        for(i=b.length-1;i>=0;i--)
        {
            System.out.print(b[i]+" ");
        }
    }
}
