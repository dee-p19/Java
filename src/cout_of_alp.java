import java.util.*;
public class cout_of_alp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        int[]a =new int[26];
        int i;
        for (i=0;i<s.length();i++)
        {  if(s.charAt(i)!=' ');
           a[s.charAt(i)-'a']++;
        }


    }
}
