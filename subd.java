public class subd {
    int a=200, b=400;
    static int x = 500;
    public void add(int num1,int num2){
        int sum = num1 + num2;
        System.out.println("The sum is : " + sum);
    }

    public static void main(String[] args) {
        subd t = new subd();
        System.out.println(t.a);
        System.out.println(subd.x);
        t.add(10,5);

    }
}