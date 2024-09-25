package basic;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        
    }
}
