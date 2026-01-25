import java.util.*;
public class mini_step_by_step {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min=1000,sum=0;
        int []a={3,-2,1,5,-4,8,-3,-2};
        for(int i=1;i<a.length;i+=1)
        {
            sum=sum+a[i];
            if(min>sum)
                min=sum;
        }

    }

}
