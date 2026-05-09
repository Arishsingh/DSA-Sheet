//Create a function to reverse a number.


public class A46{
    public static void reverse(int n){
        int rev = 0;

        while(n!=0){
            int digit = n%10;
            rev = rev*10 + digit ;
            n = n/10;
        }
        System.out.println("reverse order" +rev );
    }
    public static void main(String[] args) {
        reverse(1234);
    }
}