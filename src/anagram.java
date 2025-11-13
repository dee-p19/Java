// take 2 string fron user and check whether both strings are anagram or not
import java.util.*;
public class anagram {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("enter 1st string");
    String a=sc.nextLine();
    System.out.println("enter 2st string");
    String b=sc.nextLine();
    int [] c =new int[26];
    int i,j;
    for( i=0;i<a.length();i++)
    {
        c[a.charAt(i)-'a']++;
        c[b.charAt(i)-'a']--;
    }
    for( j=0;j<26;j++)
    {
        if(c[j]!=0)
        {System.out.println("not an anagram");
            break;}
    }
    if( j==26)
    System.out.println("anagram");


}
}
