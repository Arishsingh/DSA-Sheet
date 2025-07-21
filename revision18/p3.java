import java.util.*;
public class p3 {
    public static void main(String[] args) {
        ArrayList<String> list = new  ArrayList<>();
        list.add("Alice");
        list.add("bob");
        list.add("Charlie");

        list.remove(1);

        for(String  lists:list){
        System.out.println(lists + "->");
        }

    }
}
