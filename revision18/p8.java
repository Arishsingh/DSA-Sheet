import java.util.*;

public class p8 {
public static void main(String[] args) {
    ArrayList<Integer>list = new ArrayList<>();
    list.add(30);
    list.add(10);
    list.add(50);
    list.add(20);
    list.add(40);
     //descending
     Collections.sort(list, Collections.reverseOrder());

    for(Integer lists:list){
        System.out.println(lists +" ");
    }
}
}
