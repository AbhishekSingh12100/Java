import java.util.Scanner;
public class Name {
    public static void printMyName(String name){
        System.out.println(name);
      

        
    }
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in) ;
        String name =Sc.nextLine();
        printMyName(name);
    }
    
    
}
