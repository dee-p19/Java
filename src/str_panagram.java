
//wap which will take input from user and check string is panagram or not
import java.util.*;
    public class str_panagram{
        public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
            System.out.println("enter a string:");
            String s=sc.next();
            int[] a=new int[26];
            int i;
            for(i=0;i<s.length();i++)
            {
                //if(s.charAt(i)!='\n')
                   a[s.charAt(i)-'a']+=1;
            }
            for(i=0;i<26;i++)
            {
                if(a[i]==0)
                {System.out.println("not pnagram");
                    break;}
            }
            if(i==26)
                System.out.println("Pnagram");
        }
    }

