import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> student=new HashMap<>();
        student.put(5,"deeps");
        student.put(10,"deep");
        student.put(12,"gungun");
        student.put(55,"XYZ");
        //to check student

        System.out.println(student.get(5));
        System.out.println(student.getOrDefault(5,"not found"));
        student.remove(12);
        System.out.println(student.keySet());
        System.out.println(student.values());
        int[] arr={1,2,3,4,};
        for(int i:arr){
            System.out.println(i);
        }
        for(int key: student.keySet()){
            System.out.println("key is "+ key+"value is "+student.get(key));
        }

    }
}
