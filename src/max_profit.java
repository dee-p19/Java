
import java.util.*;
public class max_profit {
    public static void main(String[] args) {
        int[]a= {12,5,7,14,95,12,98,1};
        int p=0;
        int min=a[0];
        for(int i=0;i< a.length;i++)
        {
            if (a[i]<min)
                min=a[i];
            int d=a[i]-min;
            if(p<d)
                p=d;
        }
        System.out.println("profit="+p);

    }
}
