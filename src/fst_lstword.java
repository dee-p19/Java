//write a program to check its first word is java and last word is language
import java.util.*;
public class fst_lstword {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        System.out.println("enter a string");
        String a =sc.nextLine();
        String [] b=a.split(" ");
        if (b[0].equals("java") && b[b.length-1].equals("language"))
        System.out.println("yes");
        else
         System.out.println("no");
        }


    }

