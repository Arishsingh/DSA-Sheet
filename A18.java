//Check if a number is positive or negative.
public class A18{
    public static void  check(int number){
        if(number ==0){
            System.out.print("number is zero");
        }
        else if( number <0){
            System.out.print("number is negative");
        }else{
            System.out.print("number is positive");
        }
    }
    public static void main(String[] args) {
        int number = 10;
        check(number);

    }
}