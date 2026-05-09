//Check whether a number is between 1 and 100.


public class A24{

    public static void check(int number){
        if(number >= 1 && number <= 100){
            System.out.println("the number is between 1 and 100");
        }else{
            System.out.println("the numbe is not betweeni and 100 ");
        }
    }
    public static void main(String[] args) {
        int number = -3;
        check(number);
    }
}