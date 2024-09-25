import java.util.Scanner;

public class Multiple {
    public static int  multiple(int a, int b){
        return (a *b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int multiple=multiple(a,b);
        System.out.println(multiple);
    
}
}
