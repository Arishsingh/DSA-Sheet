
//Create a function to calculate factorial.


public class A45{
    public  static int factorial(int n ){
        if(n==0 || n==1){
         return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 3;
        int result = factorial(n);
        System.out.println(result);
    }
}