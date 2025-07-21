import java.util.*;

public class p7 {
public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("apple");
    list.add("banana");
    list.add("apple");
    list.add("orange");
    list.add("apple");
    int count =0;
    for(String lists : list){
    if(lists.equals("apple")){
        count++;
    }
    System.out.println(count);
    }
}
}
