//Print even numbers from 1 to 100.


public class A34{
    public static void print(){
        for(int i = 1 ; i <= 100 ; i ++){
            if(i % 2 ==0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        print();
    }
}