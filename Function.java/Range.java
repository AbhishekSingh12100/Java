
public class Range {
    public static void primesInRange(int n) {  
        boolean isPrime = true;
        for(int i=2; i<=n; i++){
            if(n%i==0) {
                System.out.print(i+" ");

            }

  
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        primesInRange(20);
        
    }
}
    
