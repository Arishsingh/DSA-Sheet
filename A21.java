//Check if a person is eligible to vote.


public class A21{

    public static void person(int age){
        if(age  >=  18 ){
            System.out.println("yeah you can drive");
            }else{
                System.out.println("you can't drive");
            }
        }
    public static void main(String[] args) {
        int age = 3;
        person(age);
    }
}