// wap to remove all duplilcate charcter for a string
import java.util.*;
public class remov_dupli {
    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in) ;
      String s=sc.nextLine();
      String a="                     ";
      int i,k;
      int []b=new int[26];
      for(i=0;i<s.length();i++) {
          b[s.charAt(i) - 'a']++;
      }
      for(i=0,k=0;i<s.length();i++) {
          if (b[s.charAt(i) - 'a'] == 1) {
              //a.charAt(k) = s.charAt(i);
              k++;
          }
      }
        System.out.println(a);



//          for( j=1;j<i;j++)
//          {if(a.charAt(j)==s.charAt(i))
//                  break;}
//          if(j==i)
//          {a.charAt(k)=s.charAt(i);
//              k++;}


    }
}
