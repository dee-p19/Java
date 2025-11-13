//wap to check frequency of repeated number in hash
import java.util.*;
public class frequency_str {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int []a={1,2,4,5,1,1,1};
        HashMap<Integer,Integer> b =new HashMap<>();
        for(int i:a)
        {
           b.put(i,b.getOrDefault(i,0)+1);
        }
        for(int key: b.keySet()){
            System.out.println(key+"-->"+b.get(key));
        }
    }
}
