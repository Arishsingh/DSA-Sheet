import java.util.*;
public class level1O {
    public static void foreach(ArrayList<Integer>list){
for(int num : list){
    System.out.print(num+"");
}

    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        foreach(list);
    }
}
