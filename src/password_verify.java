import java.util.*;
public class password_verify {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       String correctpassword = "Deepanjali-19p";
       int match = 1;
       int i = 0;

       System.out.println("Enter password");
       String s = sc.nextLine();

       while(i<s.length() && i<correctpassword.length())
       {
         if(s.charAt(i) != correctpassword.charAt(i))
         {
             match = 0;
             break;
         }
         i++;
       }

       //check if both strings ends at same time ( checking this for such type of condition deep , deepanjali)
        if (i < s.length() || i < correctpassword.length())
            match = 0;

        if(match == 1)
            System.out.println("correct passowrd");
        else
            System.out.println("incorrect password");
    }
}
