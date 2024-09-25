package basic;

import java.util.Scanner;

public class faboncci {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
         int n= Sc.nextInt();
        int a=0,b=1,c=0,i;
        System.out.println("Enter max Value:");
        if(c<=n){
            System.out.println(c);
            a=b;
            b=a;
            c=a+b;

        }
    }
}
