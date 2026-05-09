//Find the largest of three numbers.
public class A20{

    public static void greater(int number1 , int  number2 , int  number3){
    if(number1 == number2 && number2 == number3){
        System.out.print("there are equal");
    }else if(number1 > number2 && number2 > number3){
      System.out.print("number 1 is greater");
    }else if (number2 > number1 && number2 > number3){
        System.out.println("number 2 is greater");
    }else{
        System.out.println("number 3 is greater ");
    }
   
}
     public static void main(String[] args) {
     greater(2,3,4);
     

}
}
