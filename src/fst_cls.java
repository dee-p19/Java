import com.sun.jdi.PathSearchingVirtualMachine;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class fst_cls {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter:");
        int val=sc.nextInt();
        if(val%400==0)
            System.out.println("it is a leap year");
        else if(val%4==0 && val%100!=0)
            System.out.println("it is not a leap year");
    }
}