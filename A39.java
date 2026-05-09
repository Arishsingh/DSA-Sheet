//Count numbers divisible by 3 between 1–100.
public class A39{

    public static void division(){
        for(int i = 1 ; i<= 100; i++){
    if(i%3==0){
        System.out.print(i + " ");
    }
        }
    }
    public static void main(String[] args) {
        division();
    }

}