//Check if a number is multiple of both 3 and 7.


public class A23{
    public static void  check(int number){
        if(number %3 == 0 && number % 7 ==0){
            System.out.println("number is divisible by 3 and 7");
        }else{
            System.out.println("number is not  divisible by 3 and 7 ");
        }
    }
    public static void main(String[] args) {
        int number =6;
        check(number);
    }
}