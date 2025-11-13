import org.w3c.dom.ls.LSOutput;

public class string1
{
    public static void main(String[] args) {
        String s="malayalam";  //heap memory s and s1 will point the same memory
        String s1="hello";  //string is immutable

        String s2=new String( "Hi");
        System.out.println(s);
        palli(s);

    }
    public static void palli(String a)
    {   int size=a.length();
        int i,j;
        for(i=0,j=size-1;i<j;i++,j--)
        {
          if(a.charAt(i)!= a.charAt (j))
          {System.out.println("not pallindrome");
              break;}
        }
        if(i==j || i>j)
            System.out.println("pallindrome");
    }

}
