
import java.util.*;
public class count_chara {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string");
        String a=s.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
          if(a.charAt(i)==' ')
              count++;
        }
        System.out.println("no of words="+(count+1));
    }

}
