import java.util.*;

public class p4 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(35);

        if (list.contains(25)){
            System.out.println("found");
        }else{
            System.out.println("notfound");
        }
        for(Integer lists :list){
            System.out.println(lists + " ");
        }
    }
}
