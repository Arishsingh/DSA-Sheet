//Build a simple calculator (+ - * /).


public class A29{
    public void calculator(int number1 , int number2 , String operator){
        switch(operator){

            case "+" :
                System.out.println(number1 + number2);
                break;

            case "-" :
                System.out.println(number1 - number2);
                break;

            case "/" :
                System.out.println(number1 / number2);
                break;

            case "%" :
                System.out.println(number1 % number2);
                break;

        default:
            System.err.println("");
    }
    }
}