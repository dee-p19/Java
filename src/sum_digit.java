import java.util.Scanner;

import java.util.*;
public class sum_digit {
    public static void main(String[] args) {
        System.out.println("enter num:");
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int i=0;
        for( ;num>10;i++)
        { num=num/10;}
        i++;
        System.out.println("no of digits:"+i);
    }
}


