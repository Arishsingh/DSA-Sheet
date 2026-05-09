//Find sum of first N numbers.


public class A36{
    public static void sum(int n){
        int sum = 0;
        for(int i = 0 ; i <= n ; i ++){
        sum += i;

        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        int n = 3;
        sum(n);
    }
}