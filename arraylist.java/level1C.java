import java.util.*;

public class level1C {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add( "arish");
        list.add( "ajay");
        list.add( "harman");
        list.add( "vansham");


        if(list.contains("arish")){
            System.out.println("name exist in the list");
        }else{
            System.out.println("name  does not exist in the list");

        }
    }
}
//to check if it exist = arrayname.conatin("search element ")