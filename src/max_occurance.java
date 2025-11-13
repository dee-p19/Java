import java.util.*;
public class max_occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a={1,2,4,5,1,1,1};
        int c=0;
        HashMap<Integer,Integer> b=new HashMap<>();
        for( int i:a)
        {
            b.put(i,b.getOrDefault(i, 0)+1);
        }
        int max=0;
        for( int key: b.keySet())
        {if( b.get(key)>max)
        {  max=b.get(key);
            c=key;}
        }
        System.out.println("max occured number is:"+ c );
    }
}
//take 2 string as input from user and check if both strings are isomorphic or not
