//Create a function to find maximum of two numbers.

public class A44{
    public static void maximum(int n , int m){
        if(n > m){
            System.out.println("first number is greater " + n);
        }else{
            System.out.println("second number is greater" + m);
        }
    }
    public static void main(String[] args) {
        int n = 23;
        int m = 44;

        maximum(n, m);
    }
}