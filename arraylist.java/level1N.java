import java.util.*;
public class level1N {
    public static  void forr(ArrayList<Integer>list){

for(int i =0;i<list.size();i++){
    System.out.print(list.get(i));
}
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        forr(list);
    }
}
