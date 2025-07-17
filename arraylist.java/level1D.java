import  java.util.*;

public class level1D {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(5);

       Collections.sort(list);
       System.out.print(list);
    }
}
// sorting = collections.sort(arraylist name )