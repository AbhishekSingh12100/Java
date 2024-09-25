package condtion;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (a =='A' || a =='a'||a== 'E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a=='U'||a=='u'){
            System.out.println("vowel");

        }else{
            System.out.println("not vowel");
        }
    }
}
