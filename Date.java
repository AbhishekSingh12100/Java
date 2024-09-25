import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        switch (n) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("tuesday");
                break;
                case 3: System.out.println("wed");
                break;
                case 4: System.out.println("thus");

                break;
                case 5: System.out.println("frid");

                break;
                case 6: System.out.println("sat");

                break;
                case 7: System.out.println("sun8");

                break;
                

        
            default: System.out.println("invalid");
                break;
        }

    }
}
