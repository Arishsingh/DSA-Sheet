//Find the largest of two numbers.
public class A19{
    public static void largest(int num1 ,int num2){
        if(num1==num2){
            System.out.println("equal");
        }else if (num1 > num2 ){
            System.out.print("number 1 is greater than number2");
        }else{
            System.out.println("number 2 is greater");
        }
    }


    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 45;
        largest(num1 , num2);

    }
}